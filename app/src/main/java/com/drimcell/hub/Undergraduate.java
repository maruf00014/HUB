package com.drimcell.hub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Undergraduate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_undergraduate);

        ArrayList<String> uglist = new ArrayList<String>();

        uglist.add("Bachelor of Science (Honours) in Mathematics");
        uglist.add("Bachelor of Science (Honours) in Computer Science & Engineering");
        uglist.add("Bachelor of Science (Honours) in Electrical & Electronics Engineering");
        uglist.add("Bachelor of Business Administration (Accounting)");
        uglist.add("Bachelor of Business Administration (Finance)");
        uglist.add("Bachelor of Business Administration (Marketing)");
        uglist.add("Bachelor of Business Administration (Management)");
        uglist.add("Bachelor of Arts (Honours) in English");
        uglist.add("Bachelor of Social Science (Honours) in Economics");
        uglist.add("Bachelor of Unani Medical Sciences (BUMS)");
        uglist.add("Bachelor of Ayurvedic Medical Sciences (BAMS)");

        ArrayAdapter<String> ugAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, uglist);

        ListView uglistView = (ListView) findViewById(R.id.ugListView);
        uglistView.setAdapter(ugAdapter);
    }
}
