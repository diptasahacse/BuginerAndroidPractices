package com.example.user.textviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView1;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.textViewid1);
        textView2 = findViewById(R.id.textViewid2);


        textView1.setText("Dipta saha");
        textView2.setText("Jugol Kumar");


    }
}
