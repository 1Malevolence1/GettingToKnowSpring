package ru.alishew.springcourse.music.genresmusic;

import org.springframework.stereotype.Component;
import ru.alishew.springcourse.music.Music;

import java.util.List;


// Если не указывать id, то по умолчанию id = название классу с маленькой буквы

public class KpopMusic implements Music {

    private List<String> list = List.of("DLMLU", "Get lit", "Eternity");
    @Override
    public void start() {
        System.out.println("К-поп начал проигрываться ");
    }
    @Override
    public void end() {
        System.out.println("К-поп закончил проигрываться");
    }

    @Override
    public List<String> getSong() {
        return list;
    }
}
