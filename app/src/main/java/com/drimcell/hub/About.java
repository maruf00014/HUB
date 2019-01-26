package com.drimcell.hub;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Button foundationButton = (Button) findViewById(R.id.buttonAbout_HamdardFoundation);

        foundationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent foundationIntent = new Intent(About.this,AboutHamdardFoundation.class);
                startActivity(foundationIntent);
            }
        });

        Button hubButton = (Button) findViewById(R.id.buttonAbout_HUB);

        hubButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hubIntent = new Intent(About.this,HubActivity.class);
                startActivity(hubIntent);
            }
        });

        Button visionButton = (Button) findViewById(R.id.buttonVision);

        visionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent visionIntent = new Intent(About.this,Vision.class);
                startActivity(visionIntent);
            }
        });

        Button objAimButton = (Button) findViewById(R.id.buttonObjectives_Aims);

        objAimButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent objAimIntent = new Intent(About.this,ObjectiveAims.class);
                startActivity(objAimIntent);
            }
        });

        Button founMessButton = (Button) findViewById(R.id.buttonFounderMessage);

        founMessButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent founMessIntent = new Intent(About.this,FounderMessage.class);
                startActivity(founMessIntent);
            }
        });


    }
}
