package com.Kanareo;

import java.util.Random;

public class Player {
    private String name;

    private Random roll = new Random();

    public int rolled() {
        return roll.nextInt(6) + 1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
