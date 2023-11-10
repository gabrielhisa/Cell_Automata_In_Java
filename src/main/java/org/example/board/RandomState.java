package org.example.board;

import java.util.ArrayList;
import java.util.Random;

import static java.lang.Integer.valueOf;

public class RandomState {

    // Creating the board class, responsible for creating the board where the cells will act
    // The board will have a method inside it to define the chance of the cell being alive or dead

    public ArrayList<ArrayList> board;
    public double percentage;


    // Creates a board using width/heigh values
    public void createBoard(int width, int height) {

        ArrayList<ArrayList> createdBoard = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < width; i++) {
            ArrayList<Integer> line = new ArrayList<>();
            for (int n = 0; n < height; n++) {
                line.add(n, threshold(percentage));
            }
            createdBoard.add(line);
        }
        board = createdBoard;
    }

    // Shows the board
    public void printBoard(){
        for (ArrayList list : board){
            System.out.println(list);
        }
    }

    // This method will use a value threshold to define the chance of a cell being alive or dead (% chance of being dead)
    public int threshold(double percentage){

        Random random = new Random();

        double percent = random.nextDouble(1) * 100;
        int whole = valueOf((int) percent);

        if (whole < percentage){
            return 0;
        } else {
            return 1;
        }
    }

    // Defining the percentage
    public void setPercentage(double percentage){
        this.percentage = percentage;
    }

    // Board render
    public void render(){
        System.out.println("-".repeat(board.size()));
        for (ArrayList innerList : board){
            for (Object i : innerList){
                //System.out.println(i);
                if (i.equals(0)){
                    System.out.print(" ");
                } else {
                    System.out.print("@");
                }

            }
            System.out.print("\n");
        }
        System.out.println("-".repeat(board.size()));
    }

    // Calculating the next state
    public void nextState(){
        for (int i = 0; i < board.size(); i++){
            //System.out.println(board.get(i));
            for (int n = 0; n < board.get(i).size(); n++){
                //System.out.println(board.get(i).get(n));
                Integer spot = (Integer) board.get(i).get(n);
            }

        }
    }

}
