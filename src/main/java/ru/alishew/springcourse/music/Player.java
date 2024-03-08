package ru.alishew.springcourse.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.alishew.springcourse.music.genresmusic.ClassicalMusic;

import java.util.ArrayList;
import java.util.List;


@Component("playerMusic")
public class Player {
    private List<Music> listMusic;


    public Player() {
    }

    // внедряется зависимость из вне (IoC)

    @Autowired
    public Player(List<Music> listMusic) {
        this.listMusic = listMusic;
    }

    public void play() throws InterruptedException {
        for (Music music: listMusic
             ) {
            music.start();
            Thread.sleep(5000);
            music.end();
        }
    }



    public void addMusic(Music music) {
        if(listMusic == null ){
            listMusic = new ArrayList<>();
        }

        listMusic.add(music);
    }
}