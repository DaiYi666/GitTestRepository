package com.itxh;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContext {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        context.close();
    }
}