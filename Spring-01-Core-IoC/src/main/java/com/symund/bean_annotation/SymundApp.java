package com.symund.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SymundApp {
    public static void main(String[] args) {
        //first create a container
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class, ConfigAny.class);

        FullTimeMentor ft = container.getBean(FullTimeMentor.class);

        //PartTimeMentor pt = container.getBean("p1",PartTimeMentor.class);

        PartTimeMentor pt = container.getBean(PartTimeMentor.class);
        pt.createAccount();

        ft.createAccount();

        String str = container.getBean(String.class);

        System.out.println(str);

    }
}
