package com.Kanareo;

import java.util.Random;

public class Player {
    private String name;

    private Random roll = new Random();

    public int rolled() {
        return roll.nextInt(6) + 1;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()){
            this.name = name;
        }
        else {
            System.err.println("Invalid name!");
        }
    }

    public String getName() {
        return name;
    }

}
