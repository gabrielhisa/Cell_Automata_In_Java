package org.example;

import org.example.board.RandomState;

import java.util.ArrayList;
import java.util.Random;

import static java.lang.Integer.valueOf;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {



        // Creating a new random state
        RandomState randomState = new RandomState();

        // Defining the % of a cell being dead
        randomState.setPercentage(85);

        // Creating the board
        randomState.createBoard(10,10);



        // Printing the board
        //randomState.printBoard();

        // Printing the rendered board
        //randomState.render();

        randomState.nextState();





        /*
        Random random = new Random();

        for (int i = 0; i < 10; i++){
            double lol = random.nextDouble(1) * 100;
            int yey = Integer.valueOf((int) lol);
            System.out.println(lol);
            System.out.println(yey);
        }

         */



    }
}