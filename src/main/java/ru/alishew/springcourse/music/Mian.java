package ru.alishew.springcourse.music;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.alishew.springcourse.music.genresmusic.ClassicalMusic;
import ru.alishew.springcourse.music.genresmusic.KpopMusic;
import ru.alishew.springcourse.music.genresmusic.RockMusic;

public class Mian {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*   Player player = context.getBean("playerMusic", Player.class);

        player.play();*/

        Computer computer = context.getBean("computer", Computer.class);
        computer.playPlayer();

        context.close();


    }
}
