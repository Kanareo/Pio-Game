package com.Kanareo;

public abstract class Player {

    private String name = "Default User";

    public Player() {}

    public Player(String name) {
        setName(name);
    }

    public abstract int rolled();

    public final void setName(String name) {
        if(name != null && name.matches("^[a-zA-Z0-9\\-_]{5,}$")){
            this.name = name;
        }
        else {
            throw new IllegalArgumentException("Invalid name!");
        }
    }

    public final String getName() {
        return name;
    }

}
