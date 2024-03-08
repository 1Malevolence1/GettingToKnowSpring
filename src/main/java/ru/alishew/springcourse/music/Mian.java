package ru.alishew.springcourse.music;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.alishew.springcourse.music.genresmusic.ClassicalMusic;
import ru.alishew.springcourse.music.genresmusic.KpopMusic;
import ru.alishew.springcourse.music.genresmusic.RockMusic;

public class Mian {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Player player = context.getBean("playerMusic", Player.class);



        player.addMusic(context.getBean("classicalMusic", Music.class));
        player.addMusic(context.getBean("kpopMusic", Music.class));
        player.addMusic(context.getBean("rockMusic", Music.class));


        player.play();


    }
}
