package com.example.ex0610;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout mainLayout;
    Button btn;
    Switch swDN;
    ToggleButton tb;
    int background1 = Color.parseColor("#FF5733");
    int background2 = Color.parseColor("#33FF57");
    int background3 = Color.parseColor("#5733FF");
    int background4 = Color.parseColor("#33FFEC");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        tb = findViewById(R.id.tb);
        swDN = findViewById(R.id.swDN);
        mainLayout = findViewById(R.id.mainLayout);

    }
    public void Click(View view) {
        if (swDN.isChecked() && tb.isChecked()) {
            mainLayout.setBackgroundColor(background1);
        } else if (swDN.isChecked() && !tb.isChecked()) {
            mainLayout.setBackgroundColor(background2);
        } else if (!swDN.isChecked() && tb.isChecked()) {
            mainLayout.setBackgroundColor(background3);
        }else {
            mainLayout.setBackgroundColor(background4);
        }
    }
}