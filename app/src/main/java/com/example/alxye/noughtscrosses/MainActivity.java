package com.example.alxye.noughtscrosses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public enum Tiles {
        BLANK, NOUGHT, CROSS
    }

    public Board board = new Board();
    private Tiles currentTile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View view) {
        switch(view.getId()) {
            case (R.id.button1):
                board.setTile(0, 0, currentTile);
                break;
            case (R.id.button2):
                board.setTile(0, 1, currentTile);
                break;
            case (R.id.button3):
                board.setTile(0, 2, currentTile);
                break;
            case (R.id.button4):
                board.setTile(1, 0, currentTile);
                break;
            case (R.id.button5):
                board.setTile(1, 1, currentTile);
                break;
            case (R.id.button6):
                board.setTile(1, 2, currentTile);
                break;
            case (R.id.button7):
                board.setTile(2, 0, currentTile);
                break;
            case (R.id.button8):
                board.setTile(2, 1, currentTile);
                break;
            case (R.id.button9):
                board.setTile(2, 2, currentTile);
                break;
        }



        //Switching the currently selected tile
        currentTile = (currentTile == Tiles.CROSS) ? Tiles.NOUGHT : Tiles.CROSS;
    }


}
