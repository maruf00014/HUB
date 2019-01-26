package com.drimcell.hub;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Programs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs);


        Button ugButton = (Button) findViewById(R.id.buttonUndergraduate);

        ugButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ugIntent = new Intent(Programs.this,Undergraduate.class);
                startActivity(ugIntent);
            }
        });

        Button gButton = (Button) findViewById(R.id.buttonGraduate);

        gButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gIntent = new Intent(Programs.this,Graduate.class);
                startActivity(gIntent);
            }
        });

    }
}
