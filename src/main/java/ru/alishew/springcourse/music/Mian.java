package ru.alishew.springcourse.music;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.alishew.springcourse.SpringConfig;
import ru.alishew.springcourse.music.genresmusic.ClassicalMusic;
import ru.alishew.springcourse.music.genresmusic.KpopMusic;
import ru.alishew.springcourse.music.genresmusic.RockMusic;

public class Mian {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
         Player player = context.getBean("player", Player.class);

        player.play();



        context.close();


    }
}
