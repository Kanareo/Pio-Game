package com.Kanareo;

import java.util.Random;

public class PlayerComp extends Player {

    public PlayerComp() {}

    public PlayerComp(String name) {
        super(name);
    }

    private final Random roll = new Random();

    @Override
    public int rolled() {
        return roll.nextInt(6) + 1;
    }
}
