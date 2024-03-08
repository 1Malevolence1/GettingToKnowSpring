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



public class Player {
    private List<Music> listMusic;


    public Player() {
    }

    public Player(List<Music> listMusic) {
        this.listMusic = listMusic;
    }

    // внедряется зависимость из вне (IoC)



    public void play() throws InterruptedException {
        System.out.println(randomSong(randomGenres()));
    }



    public void addMusic(Music music) {
        if(listMusic == null ){
            listMusic = new ArrayList<>();
        }

        listMusic.add(music);
    }

    private Music randomGenres( ){
        return listMusic.get(random().nextInt(listMusic.size()));
    }

    private String randomSong(Music music){
        return music.getSong().get(random().nextInt(music.getSong().size()));
    }

    private Random random(){
        return new Random();
    }
}