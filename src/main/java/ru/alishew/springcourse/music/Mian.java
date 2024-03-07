package ru.alishew.springcourse.music;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mian {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Player player = new Player(context.getBean("music", Music.class));

        player.play();


        context.close();
    }
}
