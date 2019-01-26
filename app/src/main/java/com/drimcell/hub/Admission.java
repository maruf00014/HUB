package com.drimcell.hub;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Admission extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admission);

        Button admissionFormB = (Button)findViewById(R.id.buttonAdmissionForm);

        admissionFormB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "http://hamdarduniversity.edu.bd/Documents/files/admissionForm.pdf";
                Intent b = new Intent(Intent.ACTION_VIEW);
                b.setData(Uri.parse(url));
                startActivity(b);
            }
        });
    }
}
