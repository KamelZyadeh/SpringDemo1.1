package com.springDemo;

import org.springframework.stereotype.Component;

@Component
public class Principal {

    private String name;

    public Principal() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String var1) {
        this.name = var1;
    }

    public void print() {
        System.out.println("Principal name is " + name);
    }

    public String principalMessage() {
        return "my principal message";
    }
}
