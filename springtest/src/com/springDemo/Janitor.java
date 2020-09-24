package com.springDemo;

import org.springframework.stereotype.Component;

@Component
public class Janitor {

    private String name;

    public Janitor() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String var1) {
        this.name = var1;
    }

    public String janitorMessage () {
        return "my janitor message";
    }

    void print() {
        System.out.println("Janitor name is " + name);
    }
}
