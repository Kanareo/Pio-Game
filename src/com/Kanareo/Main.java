package com.Kanareo;

import java.util.Random;

public class Main {

    public static void main(String[] args){

        System.out.println("Pio Game");

        Random dice = new Random();
        Player player;
        if(false) {
            player = new PlayerComp();
        }
        else {
            player = new PlayerHuman();
        }

        //Player player = new PlayerHuman();
        //Player player = new Player("Ziutek");


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
