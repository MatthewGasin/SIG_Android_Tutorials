package com.lexmat.tutorialapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ArrayList<String> simpleArrayList;
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        simpleArrayList = new ArrayList<String>();
        simpleArrayList.add("1");
        simpleArrayList.add("2");
        simpleArrayList.add("3");
        simpleArrayList.add("a");
        simpleArrayList.add("b");
        simpleArrayList.add("c");

        list = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, simpleArrayList);



        list.setOnItemClickListener(this);
        list.setAdapter(dataAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(), ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
    }
}
