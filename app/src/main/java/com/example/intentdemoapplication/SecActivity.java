package com.example.intentdemoapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SecActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
        textView=(TextView)findViewById(R.id.textView);

        Intent intent=getIntent();
        if(intent.hasExtra("value")) {
            String inputFromMain = intent.getStringExtra("value");

            textView.setText(inputFromMain);

            if (inputFromMain.equals("felix")) {
                Toast.makeText(getApplicationContext(), "both are equal", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void OnGoToThird(View view) {


        Intent secActvityIntent=new Intent(SecActivity.this,ThirdActivity.class);

        startActivity(secActvityIntent);
    }
}
