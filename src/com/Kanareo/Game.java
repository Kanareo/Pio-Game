package com.Kanareo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {

    private List<Player> players = new ArrayList();
    private Random dice = new Random();

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void play() {

        if(players.isEmpty()) throw new IllegalArgumentException("Not enough players!");

        System.out.println("Pio Game");

        int computerValue;
        int playerValue;
        int round = 0;
        boolean repeat;

        do {
            round++;
            System.out.println("Round: " + round);

            repeat = false;

            computerValue = dice.nextInt(6)+1;
            for(Player player : players) {
                playerValue = player.rolled();
                if (playerValue == computerValue) {
                    System.out.println("Computer Value: " + computerValue + " " + player.getName() + " Value: " + playerValue);
                    System.out.println("Win!" + "\n");
                } else {
                    System.out.println("Computer Value: " + computerValue + " " + player.getName() + " Value: " + playerValue);
                    System.out.println("Loose, try again" + "\n");
                    repeat = true;
                }
            }
        } while(repeat);
    }

}
