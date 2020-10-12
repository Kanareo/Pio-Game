package com.Kanareo;

import java.util.Random;

public class Main {

    public static void main(String[] args){
                System.out.println("Pio Game");

                Random dice = new Random();

                int computerValue;
                int playerValue;
                int round = 0;

                while(true) {
                    round++;
                    System.out.println("Round: " + round);

                    computerValue = dice.nextInt(6)+1;
                    playerValue = dice.nextInt(6)+1;
                    if(playerValue == computerValue) {
                        System.out.println("Computer Value: " + computerValue + " Player Value: " + playerValue);
                        System.out.println("Win!" + "\n");
                        break;
                    }
                    else {
                        System.out.println("Computer Value: " + computerValue + " Player Value: " + playerValue);
                        System.out.println("Loose, try again" + "\n");
                    }
                }
    }

}
