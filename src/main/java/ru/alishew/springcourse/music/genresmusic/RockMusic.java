package ru.alishew.springcourse.music.genresmusic;

import ru.alishew.springcourse.music.Music;

public class RockMusic implements Music {
    @Override
    public void start() {
        System.out.println("Играет рок музыка");
    }

    @Override
    public void end() {
        System.out.println("Рок музыка пересатала аграть");
    }
}
