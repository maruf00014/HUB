package com.drimcell.hub;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Maruf on 24-Aug-17.
 */

public class FacultyMedicine extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        final ArrayList<ListItem> items = new ArrayList<ListItem>();

        items.add(new ListItem(R.drawable.fom_azad,"Dr. Ak Azad Khan","Dean & Professor\nFaculty of Unani & Ayurvedic Medicine\nMobile : 01711-566814\nEmail : sg_dab@dab-bd.org"));
        items.add(new ListItem(R.drawable.fom_alam,"Dr. Md.Khairul  Alam","Assistant Professor & Head\nDepartment of Unani Medicine\nMobile : 01711-260208\nEmail : Khairul_bd_73@yahoo.com"));
        items.add(new ListItem(R.drawable.fom_nabi,"Dr. Md.Mustofa Nabi","Associate Professor\nDepartment of Unani Medicine\nMobile : 01775-022988\nEmail : drmustofa@yahoo.com"));
        items.add(new ListItem(R.drawable.fom_nazrul,"Dr. Mohammad Nazrul  Islam","Assistant Professor\nDepartment of Unani Medicine\nMobile : 01732-780912\nEmail : dr_sayemnazrul@yahoo.com"));
        items.add(new ListItem(R.drawable.fom_khan,"Dr. Md. Maniruzzaman Khan","Assistant Professor\nDepartment of Unani Medicine \nMobile : 01710-055176\nEmail : Monirkhan82@gmail.com"));
        items.add(new ListItem(R.drawable.fom_nyeem,"Dr. Mohammad Abu Bin Nyeem","Assistant Professor\nDepartment of Unani Medicine\nMobile :  01712-619037\nEmail : nyeemph@yahoo.com"));
        items.add(new ListItem(R.drawable.fom_jahirul,"Dr. Md. Jahirul Islam","Lecturer\nDepartment of Unani Medicine\nMobile : 01720-072300\nEmail : drjahirul@yahoo.com"));
        items.add(new ListItem(R.drawable.fom_taher,"Dr. Mohammad Abu Taher","Lecturer\nDepartment of Unani Medicine\nMobile : 01710-005600\nEmail : abutaher2005@yahoo.com"));
        items.add(new ListItem(R.drawable.fom_bijoya,"Dr. Bijoya Islam","Lecturer\nDepartment of Unani Medicine\nMobile : 01710-485868\nEmail : bijoyamithi@gmail.com"));
        items.add(new ListItem(R.drawable.fom_mannan,"Dr. Md.Abdul Mannan","Lecturer\nDepartment of Unani Medicine\nMobile : 01715-738207\nEmail : mannanbmlt@yahoo.com"));
        items.add(new ListItem(R.drawable.fom_hasib,"Dr. Hasib Sheikh","Lecturer & Head\nDepartment of Ayurvedic Medicine\nMobile : 01719-392281\nEmail : docharmahasib@gmail.com"));
        items.add(new ListItem(R.drawable.fom_monir,"Dr. Md. Monir Ahmed","Lecturer\nDepartment of Ayurvedic Medicine\nMobile : 01755-547126\nEmail : Dr.e.monir@gmail.com"));
        items.add(new ListItem(R.drawable.fom_masum,"Dr. Md. Masum Billah","Lecturer\nDepartment of Ayurvedic Medicine\nMobile : 01917662476\nEmail : Masumn70@gmail.com"));
       // items.add(new ListItem(R.drawable.fom_,"",""));




        ListItemAdaper listItemAdaper = new ListItemAdaper(this,items);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(listItemAdaper);



    }
}
