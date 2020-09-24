package com.springDemo;

import org.springframework.stereotype.Component;

@Component
public class Substitute {

    private String name;

    public Substitute() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String var1) {
        this.name = var1;
    }

    public void print(){
        System.out.println("Substitute name is " + name);
    }

    public String substituteMessage() {
        return "my substitute message";
    }
}
