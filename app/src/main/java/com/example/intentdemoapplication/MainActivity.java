package com.example.intentdemoapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtText;
    Button btnRedirect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtText=(EditText)findViewById(R.id.editText);
        btnRedirect=(Button)findViewById(R.id.button);


        btnRedirect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput=edtText.getText().toString();


                Intent secActvityIntent=new Intent(MainActivity.this,SecActivity.class);
                secActvityIntent.putExtra("value",userInput);
                startActivity(secActvityIntent);
            }
        });

    }
}
