package com.Kanareo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        Game game = new Game();

        List<String> list = new ArrayList();
        game.addPlayer(new PlayerComp("Bottt1"));
        game.addPlayer(new PlayerComp("Bottt2"));

        game.play();

    }

}
