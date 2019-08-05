package com.example.alxye.noughtscrosses;

import static com.example.alxye.noughtscrosses.MainActivity.Tiles;

public class Board {

    //The encoding is: [-1 : nought, 1 : cross]
    private int[][] field = new int[][]{
            { 0, 0, 0 },
            { 0, 0, 0 },
            { 0, 0, 0 }
    };


    // TODO: 05-Aug-19 UNFINISHED ALGORITHM
    //Checks if someone has won the game
    public boolean gameWon() {
        //Checking horizontal rows
        int line = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(field[i][j] != 0) line++;
            }
            if(line == 3) return true;
            else line = 0;

        }

        //Checking Vertical columns

        //Checking Diagonals

        return false;
    }

    public void setTile(int row, int column, Tiles tiles) {
        if(field[row][column] == 0)
            field[row][column] = ((tiles != Tiles.BLANK) && tiles == Tiles.CROSS) ? 1 : -1;
        else
            System.err.println("This tile is not blank");
    }



    //Getter for the playing field
    public int[][] getField() {
        return field;
    }
}
