package com.example.startspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;


// Spring Bean

public class Test {
    public static void main(String[] args) {
        // ApplicationContext используется для полученния бина
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // получаем объект из контейнера
        // id - name
        // Pet.class - какого типа этот объект
        MethodsOfMovement methodsOfMovement = context.getBean("run", MethodsOfMovement.class);

        methodsOfMovement.run();

        context.close();
    }
}
