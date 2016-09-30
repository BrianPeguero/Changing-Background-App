package com.example.brian.changingbackgroundcolor;

import android.graphics.Color;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import java.math.*;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button colorChanger;
    RelativeLayout r1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorChanger = (Button) findViewById(R.id.button);
        r1 = (RelativeLayout) findViewById(R.id.r1);

        colorChanger.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Random rand = new Random();
                int a = rand.nextInt(255);
                int r = rand.nextInt(255);
                int g = rand.nextInt(255);
                int b = rand.nextInt(255);
                int randomColor = Color.argb(a,r,g,b);
                r1.setBackgroundColor(randomColor);
            }
        });

        colorChanger.setOnLongClickListener(new View.OnLongClickListener(){
            public boolean onLongClick(View v){
                int reset = Color.argb(255,255,255,255);
                r1.setBackgroundColor(reset);
                return true;
            }
        });

    }
}
