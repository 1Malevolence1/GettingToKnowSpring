package ru.alishew.springcourse.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;

    @Autowired
    private Player player;


    public void playPlayer() throws InterruptedException {
        player.play();
    }
}
