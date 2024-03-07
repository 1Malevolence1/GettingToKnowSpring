package ru.alishew.springcourse.music;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.alishew.springcourse.music.genresmusic.ClassicalMusic;
import ru.alishew.springcourse.music.genresmusic.KpopMusic;
import ru.alishew.springcourse.music.genresmusic.RockMusic;

public class Mian {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Player player = context.getBean("musicPlayer", Player.class);

        player.addMusic(context.getBean("musicRock", RockMusic.class));
        player.addMusic(context.getBean("musicKpop", KpopMusic.class));
        player.addMusic(context.getBean("musicClassical", ClassicalMusic.class));


        player.play();


    }
}
