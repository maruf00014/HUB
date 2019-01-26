package com.drimcell.hub;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Maruf on 24-Aug-17.
 */

public class FacultyBusiness extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        final ArrayList<ListItem> items = new ArrayList<ListItem>();

        items.add(new ListItem(R.drawable.fob_nasim,"Dr. Md. Nasim Anjum","Professor, Head & Dean\nDepartment of Management\nMobile : 01711-301301\nEmail : dr.anjum1234@gmail.com"));
        items.add(new ListItem(R.drawable.fob_sakil,"Md. Zahidul Hashan Sakil","Lecturer\nDepartment of Management\nMobile : 01914-015470\nEmail : shakilmgt@yahoo.com"));
        items.add(new ListItem(R.drawable.fob_sonjoy,"Sonjoy Maitra","Assistant Professor & Head\nDepartment of Accounting\nMobile : 01717-031187\nEmail : sonjoymaitra79@gmail.com"));
        items.add(new ListItem(R.drawable.fob_rasel,"Rashel Sheikh","Lecturer\nDepartment of Accounting\nMobile : 01919-890193\nEmail : rashelsheikh@yahoo.com"));
        items.add(new ListItem(R.drawable.fob_faruk,"Md. Faruk Hossain","Assistant Professor\nDepartment of Finance\nMobile : 01721-550877\nEmail : faruk_par@yahoo.com"));
        items.add(new ListItem(R.drawable.fob_mahmuda,"Mahmuda Akter","Lecturer\nDepartment of Finance\nMobile : 01936-560940\nEmail : mahmuda.subarna@gmai.com"));
        items.add(new ListItem(R.drawable.fob_ayesha,"Ayesha Begum","Lecturer\nDepartment of Finance\nMobile : 01616-228212\nEmail : asa_akther@yahoo.com"));
        items.add(new ListItem(R.drawable.fob_farooq,"Farooq Hossan","Assistant Professor & Head\nDepartment of Marketing\nMobile : 01815-189881\nEmail : 2arooq.hossan@yahoo.com"));
        items.add(new ListItem(R.drawable.fob_shakil,"A.K.M Shakil Mahmud","Lecturer\nDepartment of Marketing\nMobile : 01929-884648\nEmail : md.shakil1985@gmail.com"));
        items.add(new ListItem(R.drawable.fob_marzan,"Marzan Rahman","Lecturer\nDepartment of Marketing\nMobile : 01779-481482\nEmail : marzan.badhon@yahoo.com"));
       /* items.add(new ListItem(R.drawable.fob_,"",""));
        items.add(new ListItem(R.drawable.fob_,"",""));
*/




        ListItemAdaper listItemAdaper = new ListItemAdaper(this,items);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(listItemAdaper);



    }
}
