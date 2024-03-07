package ru.alishew.springcourse.music.genresmusic;

import ru.alishew.springcourse.music.Music;

public class ClassicalMusic implements Music {
    @Override
    public void start() {
        System.out.println("Играет классическая музыка");
    }

    @Override
    public void end() {
        System.out.println("Классическая музыка закончила играть");
    }
}
