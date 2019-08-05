package com.example.alxye.noughtscrosses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View view) {
        switch(view.getId()) {
            case (R.id.button1):
                break;
            case (R.id.button2):
                break;
            case (R.id.button3):
                break;
        }
    }
}
