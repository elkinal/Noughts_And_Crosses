package com.example.alxye.noughtscrosses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public enum Tiles {
        BLANK, NOUGHT, CROSS
    }

    public Board board = new Board();
    private Tiles currentTile = Tiles.CROSS;

    //Stores all of the Button objects
    private Button[][] buttons;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //This initializes all of the Button objects in the "buttons" array
        buttons = new Button[][]{
                {findViewById(R.id.button1), findViewById(R.id.button2), findViewById(R.id.button3)},
                {findViewById(R.id.button4), findViewById(R.id.button5), findViewById(R.id.button6)},
                {findViewById(R.id.button7), findViewById(R.id.button8), findViewById(R.id.button9)}
        };
    }

    public void buttonClicked(View view) {

        //Checking which button was pressed
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

        //Changing the images of the buttons
        updateField(view);

        //Switching the currently selected tile
        currentTile = (currentTile == Tiles.CROSS) ? Tiles.NOUGHT : Tiles.CROSS;
    }

    private void updateField(View view) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (board.getField()[i][j]) {
                    case -1:
                        buttons[i][j].setBackgroundResource(R.drawable.nought);
                        break;
                    case 0:
                        buttons[i][j].setBackgroundResource(R.drawable.blank);
                        break;
                    case 1:
                        buttons[i][j].setBackgroundResource(R.drawable.cross);
                        break;
                }
            }
        }
        System.out.println(board.gameWon());
    }
}
