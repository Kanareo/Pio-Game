package com.Kanareo;

import java.util.Scanner;

public class PlayerHuman extends Player {

    public PlayerHuman() {}

    public PlayerHuman(String name) {
        super(name);
    }

    private final Scanner scan = new Scanner(System.in);

    @Override
    public int rolled() {
        System.out.print("Pick number (1-6): ");
        return scan.nextInt();
    }

}
