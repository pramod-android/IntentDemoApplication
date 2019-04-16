package com.example.intentdemoapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
        textView=(TextView)findViewById(R.id.textView);

        Intent intent=getIntent();
        String inputFromMain=intent.getStringExtra("value");

        textView.setText(inputFromMain);

    }
}
