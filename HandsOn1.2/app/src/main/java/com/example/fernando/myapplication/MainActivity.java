package com.example.fernando.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int count = 0;
    private Random random = new Random();

    private int[] mColorChoices = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DKGRAY, Color.GRAY,
    Color.GREEN, Color.LTGRAY, Color.MAGENTA, Color.RED, Color.WHITE, Color.YELLOW};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void switchColor(View view) {
        TextView textview = findViewById(R.id.textView);
        randomizeColor(textview);
    }

    public void randomizeColor(TextView textview) {
        int color = random.nextInt(mColorChoices.length);
        textview.setTextColor(mColorChoices[color]);
        count++;
        textview.setText(count + "");
    }
}
