package ru.alishew.springcourse.music.genresmusic;

import org.springframework.stereotype.Component;
import ru.alishew.springcourse.music.Music;


// Если не указывать id, то по умолчанию id = название классу с маленькой буквы
@Component
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
