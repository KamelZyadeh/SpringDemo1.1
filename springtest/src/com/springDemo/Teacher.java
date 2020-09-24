package com.springDemo;

import org.springframework.stereotype.Component;

@Component
public class Teacher {

    private String name;

    public Teacher() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String var1) {
        this.name = var1;
    }

    public void print(){
        System.out.println("Teacher name is " + name);
    }

    public String teacherMessage() {
        return "my teacher message";
    }
}
