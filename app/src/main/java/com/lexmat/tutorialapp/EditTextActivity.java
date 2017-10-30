package com.lexmat.tutorialapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EditTextActivity extends AppCompatActivity {

    EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        edit = (EditText) findViewById(R.id.editText);
    }

    public void onClick(View view) {
        String s = edit.getText().toString();
        Intent intent = new Intent(this, RecieverActivity.class);
        intent.putExtra("editText", s);
        startActivity(intent);
    }
}
