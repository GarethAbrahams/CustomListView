package com.garethabrahams.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private Context context;
    private ArrayList progList;

    public static Integer [] progImages={
      R.drawable.youtube,R.drawable.facebook,R.drawable.gmail,
      R.drawable.instagram,R.drawable.linkedin,R.drawable.skype,
      R.drawable.snapchat,R.drawable.twitter,R.drawable.whatsapp
    };

    public static String [] progNames={
      "Youtube","Facebook","Gmail","Instagram","LinkedIn","Skype","Snapchat","Twitter","Whatsapp"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView) findViewById(R.id.listView);
        MyListAdapter myAdapter = new MyListAdapter(this,progNames,progImages);

        listView.setAdapter(myAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "You clicked on "+progNames[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}