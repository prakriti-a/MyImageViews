package com.prakriti.imageviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img1, img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
    }

    public void flipImage(View v) {
        if(img1.getVisibility()==View.VISIBLE) {
            img1.setVisibility(View.GONE);
            img2.setVisibility(View.VISIBLE);
        }
        else if(img2.getVisibility()==View.VISIBLE) {
            img2.setVisibility(View.GONE);
            img1.setVisibility(View.VISIBLE);
        }
    }

    public void nextPage(View v) {
        Intent i = new Intent(this, ActivityB.class);
        startActivity(i);
    }
}