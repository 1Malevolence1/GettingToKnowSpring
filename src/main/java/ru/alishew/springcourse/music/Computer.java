package ru.alishew.springcourse.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;


    private Player player;
    @Autowired
    private Computer(Player player){
        this.id = 1;
        this.player = player;

    }
  /*  public void playPlayer() throws InterruptedException {
        player.play();
    }*/
}
