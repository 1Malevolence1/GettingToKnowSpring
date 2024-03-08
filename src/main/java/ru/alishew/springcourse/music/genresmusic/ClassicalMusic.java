package ru.alishew.springcourse.music.genresmusic;

import org.springframework.stereotype.Component;
import ru.alishew.springcourse.music.Music;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


@Component("classicalMusic")
public class ClassicalMusic implements Music {

    private List<String> songs = List.of("Луная соната", "К Элизе", "Турецкое рондо");
    @Override
    public void start() {
        for (String music: songs
             ) {
            System.out.println("Играет: " + music);
        }
    }

    @Override
    public void end() {
        System.out.println("Классическая музыка закончила играть");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }

}
