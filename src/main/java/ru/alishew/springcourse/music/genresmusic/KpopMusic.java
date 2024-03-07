package ru.alishew.springcourse.music.genresmusic;

import ru.alishew.springcourse.music.Music;

public class KpopMusic implements Music {



    @Override
    public void start() {
        System.out.println("К-поп начал проигрываться ");
    }
    @Override
    public void end() {
        System.out.println("К-поп закончил проигрываться");
    }
}
