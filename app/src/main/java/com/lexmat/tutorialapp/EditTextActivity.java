package com.lexmat.tutorialapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EditTextActivity extends AppCompatActivity {

    EditText edit;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        edit = (EditText) findViewById(R.id.editText);
        text = (TextView) findViewById(R.id.changeText);
    }

    public void onClick(View view) {
        String s = edit.getText().toString();
        text.setText(s);
    }
}
