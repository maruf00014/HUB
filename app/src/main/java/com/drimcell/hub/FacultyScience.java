package com.drimcell.hub;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Maruf on 24-Aug-17.
 */

public class FacultyScience extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        final ArrayList<ListItem> items = new ArrayList<ListItem>();
        items.add(new ListItem(R.drawable.fos_jabiullah,"Prof. Dr. Md. Ismail Jabiullah","Professor & Dean, Head\nDepartment of Computer Science & Engineering\nMobile : 01819-299960\nEmail : mij1996@gmail.com"));
        items.add(new ListItem(R.drawable.fos_monowar,"Engr. Md. Monowar Hossain","Lecturer\nDepartment of Computer Science & Engineering\nMobile : 01717-270550\nEmail : mhossain_cse@yahoo.com"));
        items.add(new ListItem(R.drawable.fos_mukib,"Md.Abdul Mukib","Lecturer\nDepartment of Computer Science & Engineering\nMobile : 01912-719224\nEmail : mukib.hub@gmail.com"));
        items.add(new ListItem(R.drawable.fos_shahidul,"Md.Shahidul Islam","Lecturer\nDepartment of Computer Science & Engineering\nMobile : 01913-507788\nEmail : masum25m@gmail.com"));
        items.add(new ListItem(R.drawable.fos_solaiman,"Md.Solaiman Mia","Lecturer\nDepartment of Computer Science & Engineering\nMobile : 01976524626\nEmail : solaimanducse@yahoo.com"));
        items.add(new ListItem(R.drawable.fos_rabiul,"Dr. Mohammad R Alam","Associate Professor & Head\nDepartment of Electrical & Electronic Engineering\nMobile : 01710-833566\nEmail : alam2007@mail.com"));
        items.add(new ListItem(R.drawable.fos_salim,"Md. Salim Raza","Lecturer\nDepartment of Electrical & Electronic Engineering\nMobile : 01931-655045\nEmail : Salim- aece4@yahoo.com"));
        items.add(new ListItem(R.drawable.fos_najmin,"Najmin Ara Sultana","Lecturer\nDepartment of Electrical & Electronic Engineering\nMobile : 01719-364504\nEmail : najmineee@gmail.com"));
      /*  items.add(new ListItem(R.drawable.fos_,"",""));
        items.add(new ListItem(R.drawable.fos_,"",""));
        items.add(new ListItem(R.drawable.fos_,"",""));
        items.add(new ListItem(R.drawable.fos_,"",""));
        items.add(new ListItem(R.drawable.fos_,"","")); */
        items.add(new ListItem(R.drawable.off_munsi,"Md. Jahirul Haque Munshi","Head, Proctor & Lecturer \nDepartment of Mathematics\nMobile : 01819-274767\nEmail : jahirmath@gmail.com"));
        items.add(new ListItem(R.drawable.fos_mobarak,"Md. Mobarak Hossain","Lecturer\nDepartment of Mathematics\nMobile : 01717-223713\nEmail : mobarak4074@gmail.com"));
        items.add(new ListItem(R.drawable.fos_mostofa,"Golam Mostafa","Lecturer\n Department of Mathematics\nMobile : 01911-925826\nEmail : Mostafamatho2@gmail.com"));




        ListItemAdaper listItemAdaper = new ListItemAdaper(this,items);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(listItemAdaper);



    }
}

