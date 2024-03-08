package ru.alishew.springcourse.music;

import java.util.List;

public interface Music {
    void start();

    void end();

    List<String> getSong();
}
