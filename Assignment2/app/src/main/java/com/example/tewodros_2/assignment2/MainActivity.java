package com.example.tewodros_2.assignment2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout lay = new LinearLayout(this);
        lay.setGravity(Gravity.TOP);
        lay.setOrientation(LinearLayout.VERTICAL);


        TextView lable1 = new TextView(this);
        TextView lable2 = new TextView(this);
        TextView lable3 = new TextView(this);

        lable1.setTextSize(50);
        lable2.setTextSize(50);
        lable3.setTextSize(50);

        lable1.setBackgroundColor(Color.YELLOW);
        lable2.setBackgroundColor(Color.RED);
        lable3.setBackgroundColor(Color.GREEN);

        lable1.setText("Welcome to Teddy App Title");
        lable2.setText("Welcome to Teddy App Body Text");
        lable3.setText("Welcome to Teddy App closing remark");

        lay.addView(lable1);
        lay.addView(lable2);
        lay.addView(lable3);

        setContentView(lay);

        LinearLayout.LayoutParams par = new LinearLayout.LayoutParams(100, 25);
        lable1.setLayoutParams(par);


    }
}
