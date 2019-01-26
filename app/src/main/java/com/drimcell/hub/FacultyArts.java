package com.drimcell.hub;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Maruf on 24-Aug-17.
 */

public class FacultyArts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        final ArrayList<ListItem> items = new ArrayList<ListItem>();

        items.add(new ListItem(R.drawable.arts_sadirul,"Dr. Mohammad Sadirul Islam","Professor & Dean\nDepartment of English\nMobile : 01720-447800\nEmail : mislam47@gmail.com"));
        items.add(new ListItem(R.drawable.arts_ali,"Md. Shawkat Ali","Assistant Professor & Head\nDepartment of English\nMobile : 01911-305144\nEmail : asmsali@gmail.com"));
        items.add(new ListItem(R.drawable.arts_tahmina,"Tahmina Jarin Khanam","Lecturer\nDepartment of English\nMobile : 01712-240715\nEmail : tahmina-jarin@yahoo.com"));
        items.add(new ListItem(R.drawable.arts_nujhit,"Nujhat Nuari Islam","Lecturer\nDepartment of English\nMobile : 01813-771787\nEmail : neel.nujhat@gmail.com"));
        items.add(new ListItem(R.drawable.arts_main,"Md.Mainuddin Bhuiyan","Lecturer\nDepartment of English\nMobile : 01718-177748\nEmail : rassel_ju@yahoo.com"));
        items.add(new ListItem(R.drawable.arts_imam,"Md. Imam Hossain","Lecturer\nDepartment of Economics\nMobile : 01913-449003\nEmail : imam009@yahoo.com"));
        items.add(new ListItem(R.drawable.arts_rakibul,"Rakibul Hasan","Lecturer\nDepartment of Economics\nMobile : 01913-993299\nEmail : jurakib99@yahoo.com"));
        items.add(new ListItem(R.drawable.arts_kabir,"Khandoker Monjure Kabir","Lecturer& Head\nDepartment of Economics\nMobile : 01817-518885\nEmail : monjurey@yahoo.com"));
       // items.add(new ListItem(R.drawable.arts_,"",""));




        ListItemAdaper listItemAdaper = new ListItemAdaper(this,items);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(listItemAdaper);



    }
}

