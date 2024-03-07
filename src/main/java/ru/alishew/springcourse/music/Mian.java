package ru.alishew.springcourse.music;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mian {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Player player = context.getBean("musicPlayer", Player.class);

        player.play();


        System.out.println(player.getName());
        System.out.println(player.getValue());
        context.close();
    }
}
