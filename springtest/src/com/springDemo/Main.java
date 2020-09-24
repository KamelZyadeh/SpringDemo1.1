package com.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        Student student = applicationContext.getBean(Student.class);
        System.out.println(student.studentMessage());

        Teacher teacher = applicationContext.getBean(Teacher.class);
        System.out.println(teacher.teacherMessage());

        Substitute substitute = applicationContext.getBean(Substitute.class);
        System.out.println(substitute.substituteMessage());

        Janitor janitor = applicationContext.getBean(Janitor.class);
        System.out.println(janitor.janitorMessage());

        Principal principal = applicationContext.getBean(Principal.class);
        System.out.println(principal.principalMessage());
    }
}