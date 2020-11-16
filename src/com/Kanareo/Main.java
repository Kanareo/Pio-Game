package com.Kanareo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        Game game = new Game();

        List<String> list = new ArrayList();
        list.add("jeden");
        list.add("dwa");
        list.add("trzy");
        list.add("cztery");
        list.add("piec");

        for (String s : list) {
            System.out.println(s);
        }

        /*Player player = new PlayerComp("Computer");
        game.addPlayer(player);

        game.play();*/

    }

}
