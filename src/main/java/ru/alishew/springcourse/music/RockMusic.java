package ru.alishew.springcourse.music;

public class RockMusic implements Music{
    @Override
    public void start() {
        System.out.println("Играет рок музыка");
    }

    @Override
    public void end() {
        System.out.println("Рок музыка пересатала аграть");
    }
}
