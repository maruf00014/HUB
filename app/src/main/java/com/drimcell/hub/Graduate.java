package com.drimcell.hub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Graduate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graduate);

        ArrayList<String> glist = new ArrayList<String>();

        glist.add("Master of Business Administration (MBA)(Accounting)");
        glist.add("Executive MBA (EMBA)(Accounting)");
        glist.add("Master of Business Administration (MBA)(Finance)");
        glist.add("Executive MBA (EMBA)(Finance)");
        glist.add("Master of Business Administration (MBA)(Marketing)");
        glist.add("Executive MBA (EMBA)(Marketing)");
        glist.add("Master of Business Administration (MBA)(Management)");
        glist.add("Executive MBA (EMBA)(Management)");


        ArrayAdapter<String> gAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, glist);

        ListView glistView = (ListView) findViewById(R.id.gListView);
        glistView.setAdapter(gAdapter);
    }
}
