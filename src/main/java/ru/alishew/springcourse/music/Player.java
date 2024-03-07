package ru.alishew.springcourse.music;

public class Player {
    private Music music;

    private String name;

    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public Player() {
    }

    // внедряется зависимость из вне (IoC)
    public Player(Music music) {
        this.music = music;
    }

    public void play(){
        music.start();
        music.end();
    }
}