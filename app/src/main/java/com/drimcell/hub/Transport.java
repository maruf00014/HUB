package com.drimcell.hub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Transport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport);

        Button trackButton = findViewById(R.id.buttonTrackBus);

        trackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent trackIntent = new Intent(
                        Transport.this,BusTrackerActivity.class);
                startActivity(trackIntent);
            }
        });
    }
}
