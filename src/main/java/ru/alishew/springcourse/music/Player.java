package ru.alishew.springcourse.music;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component("playerMusic")
public class Player {
    private List<Music> listMusic;


    public Player() {
    }

    // внедряется зависимость из вне (IoC)
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