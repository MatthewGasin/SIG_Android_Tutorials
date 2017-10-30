package com.lexmat.tutorialapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RecieverActivity extends AppCompatActivity {

    TextView recieverText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciever);

        Intent intent = getIntent();
        String text = intent.getStringExtra("editText");

        recieverText = (TextView) findViewById(R.id.recieverText);
        recieverText.setText(text);
    }
}
