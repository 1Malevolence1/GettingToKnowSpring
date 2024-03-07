package ru.alishew.springcourse.music;

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
