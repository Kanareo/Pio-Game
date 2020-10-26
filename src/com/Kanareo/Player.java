package com.Kanareo;

import java.util.Random;

public abstract class Player {

    private String name = "Default User";

    public Player() {}

    public Player(String name) {
        setName(name);
    }

    public abstract int rolled();

    public final void setName(String name) {
        if(name != null && !name.isEmpty()){
            this.name = name;
        }
        else {
            System.err.println("Invalid name!");
        }
    }

    public final String getName() {
        return name;
    }

}
