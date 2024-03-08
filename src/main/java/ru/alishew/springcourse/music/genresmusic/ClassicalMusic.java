package ru.alishew.springcourse.music.genresmusic;

import org.springframework.stereotype.Component;
import ru.alishew.springcourse.music.Music;


@Component("classicalMusic")
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
