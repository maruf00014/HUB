package com.drimcell.hub;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Authorities extends AppCompatActivity {

    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authorities);

        Button trusteeButton = (Button) findViewById(R.id.trusteeButton);

        trusteeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trusteeIntent = new Intent(Authorities.this,BoardTrustees.class);
                startActivity(trusteeIntent);
            }
        });


        Button officerButton = (Button) findViewById(R.id.officerButton);

        officerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent officerIntent = new Intent(Authorities.this,PrincipleOfficer.class);
                startActivity(officerIntent);
            }
        });

        ExpandableListView expListView = (ExpandableListView) findViewById(R.id.lvExp);


        prepareListData();

        ExpandableListAdapter listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);


               // Listview on child click listener
        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {


               int position = childPosition;

                if(position == 0)
                {
                    Intent fsetIntent = new Intent(Authorities.this,FacultyScience.class);
                    startActivity(fsetIntent);
                }
                else if(position == 1)
                {
                    Intent fbaIntent = new Intent(Authorities.this,FacultyBusiness.class);
                    startActivity(fbaIntent);

                }
                else if(position == 2)
                {
                    Intent fassIntent = new Intent(Authorities.this,FacultyArts.class);
                    startActivity(fassIntent);
                }
                else {
                    Intent fnmIntent = new Intent(Authorities.this,FacultyMedicine.class);
                    startActivity(fnmIntent);

                }

                return false;
            }
        });
    }


    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("FACULTY MEMBERS");


        // Adding child data
        List<String> facMem= new ArrayList<String>();
        facMem.add("Faculty of Science, Engineering and Technology");
        facMem.add("Faculty of Business Administration");
        facMem.add("Faculty of Arts and Social Science");
        facMem.add("Faculty of Natural Medicine");

        listDataChild.put(listDataHeader.get(0), facMem); // Header, Child data

    }
}


