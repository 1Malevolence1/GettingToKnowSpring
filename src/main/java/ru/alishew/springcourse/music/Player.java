package ru.alishew.springcourse.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.alishew.springcourse.music.genresmusic.ClassicalMusic;
import ru.alishew.springcourse.music.genresmusic.RockMusic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;


@Component("playerMusic")
public class Player {
    private List<Music> listMusic;

    private ClassicalMusic classicalMusic;

    private RockMusic rockMusic;

    public Player() {
    }

    @Autowired
    public Player(@Qualifier("classicalMusic") ClassicalMusic classicalMusic,
                  @Qualifier("rockMusic") RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    // внедряется зависимость из вне (IoC)



    public void play(Genres e) throws InterruptedException {

        switch (e){
            case CLASSICALMUSIC -> randomSong(classicalMusic);
            case ROCKMUSIC -> randomSong(rockMusic);


            default -> throw new IllegalStateException("Unexpected value: " + e);
        }
    }



    public void addMusic(Music music) {
        if(listMusic == null ){
            listMusic = new ArrayList<>();
        }

        listMusic.add(music);
    }

    private void randomSong(Music music){
        Random random = new Random();
        System.out.println(music.getSong().get(random.nextInt(music.getSong().size())));
    }
}