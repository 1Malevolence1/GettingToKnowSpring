package ru.alishew.springcourse.music;

public class Player {
    private Music music;

    // внедряется зависимость из вне (IoC)
    public Player(Music music) {
        this.music = music;
    }

    public void play(){
        music.start();
        music.end();
    }
}