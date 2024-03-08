package ru.alishew.springcourse.music.genresmusic;

import org.springframework.stereotype.Component;
import ru.alishew.springcourse.music.Music;

import java.util.List;

@Component
public class RockMusic implements Music {

    private List<String> list = List.of("Король и шут", "Монетка", "Колдун");



    @Override
    public void start() {
        System.out.println("Играет рок музыка");
    }

    @Override
    public void end() {
        System.out.println("Рок музыка пересатала аграть");
    }

    @Override
    public List<String> getSong() {
        return list;
    }
}
