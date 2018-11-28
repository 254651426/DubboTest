package com.yangjie.idea;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {

        // 测试常规服务
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        Helloservice helloservice = (Helloservice) context.getBean("helloservice");
        System.out.println(helloservice.hello("yj"));
    }

}



