package com.Kanareo;

import java.util.Random;

public class Game {

    private Player player;
    private Random dice = new Random();

    public void addPlayer(Player player) {

        this.player = player;
    }

    public void play() {

        System.out.println("Pio Game");

        int computerValue;
        int playerValue;
        int round = 0;

        while(true) {
            round++;
            System.out.println("Round: " + round);

            computerValue = dice.nextInt(6)+1;
            playerValue = player.rolled();
            if(playerValue == computerValue) {
                System.out.println("Computer Value: " + computerValue + " " + player.getName() + " Value: " + playerValue);
                System.out.println("Win!" + "\n");
                break;
            }
            else {
                System.out.println("Computer Value: " + computerValue + " " + player.getName() + " Value: " + playerValue);
                System.out.println("Loose, try again" + "\n");
            }
        }
    }

}
