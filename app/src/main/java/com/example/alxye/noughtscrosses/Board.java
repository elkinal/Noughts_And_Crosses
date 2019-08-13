package com.example.alxye.noughtscrosses;

import java.util.Arrays;

import static com.example.alxye.noughtscrosses.MainActivity.Tiles;

public class Board {

    //The encoding is: [-1 : nought, 1 : cross]
    private int[][] field = new int[][]{
            { 0, 0, 0 },
            { 0, 0, 0 },
            { 0, 0, 0 }
    };


    //Checks if someone has won the game
    boolean gameWon() {

        //Checking horizontal rows
        int line = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(field[i][j] != 0) line+=field[i][j];
            }
            if(line == 3 || line == -3) return true;
            else line = 0;
        }

        //Checking Diagonals
        return Math.abs(field[0][0] + field[1][1] + field[2][2]) == 3 ||
                Math.abs(field[0][2] + field[1][1] + field[2][0]) == 3;
    }

    void setTile(int row, int column, Tiles tiles) {
        if(field[row][column] == 0)
            field[row][column] = ((tiles != Tiles.BLANK) && tiles == Tiles.CROSS) ? 1 : -1;
        else
            System.err.println("This tile is not blank");
    }



    //Getter for the playing field
    public int[][] getField() {
        return field;
    }

    @Override
    public String toString() {
        return "Board{" + "\n" +
                "field="  + "\n" + Arrays.toString(field[0]) + "\n" + Arrays.toString(field[1]) + "\n" + Arrays.toString(field[2]) +
                '}';
    }
}
