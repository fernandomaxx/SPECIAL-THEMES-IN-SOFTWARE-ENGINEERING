package com.example.fernando.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int countPushMe = 0;
    private int countClickMe = 0;
    private Random random = new Random();

    private int[] mColorChoices = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DKGRAY, Color.GRAY,
    Color.GREEN, Color.LTGRAY, Color.MAGENTA, Color.RED, Color.WHITE, Color.YELLOW};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void switchColorClickMe(View view) {
        Button button = (Button) view;
        button.setTextColor(Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256)));
        countClickMe++;
        Toast.makeText(MainActivity.this, "Click Me foi clicado " + countClickMe + " vezes", Toast.LENGTH_SHORT).show();
    }

    public void switchColorPushMe(View view) {
        Button button = (Button) view;
        button.setTextColor(Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256)));
        countPushMe++;
        Toast.makeText(MainActivity.this, "Push Me foi clicado " + countPushMe + " vezes", Toast.LENGTH_SHORT).show();
    }
}
