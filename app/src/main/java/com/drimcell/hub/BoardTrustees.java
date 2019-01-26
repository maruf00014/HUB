package com.drimcell.hub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BoardTrustees extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        final ArrayList<ListItem> items = new ArrayList<ListItem>();

        items.add(new ListItem(R.drawable.bot_kazi,"Kazi Golam Rahman","Chairman\nFormer Secretary Government of Bangladesh"));
        items.add(new ListItem(R.drawable.img_harun,"Dr. Hakim Md. Yousuf Harun Bhuiyan","General Secretery\nHamdard University Bngladesh\nHamdard Foundation Bngladesh\nManaging Director of Hamdard Laboratories (waqf) Bangladesh\nBuilder of Modern Hamdard in Bangladesh"));
        items.add(new ListItem(R.drawable.bot_azad,"Prof. A K Azad Khan","Vice-Chairman\nPresident of Diabetic Association of Bangladesh"));
        items.add(new ListItem(R.drawable.bot_mannan,"Prof. Md. Abdul Mannan, PhD","Member\n" + "Vice Chancellor\n" + "Hamdard University Bangladesh"));
        items.add(new ListItem(R.drawable.bot_faiz,"Faiz Ahmed Bhuiyan","Member\n"  + "Waqf Administrator \n"  + "Government of Bangladesh"));
        items.add(new ListItem(R.drawable.bot_huq,"A.T.  Ahmedul Huq Choudhury ","Member\n"  + "Former Chairman, Bangladesh Public Service Commission &\n"+ "Inspector General of Police"));
        items.add(new ListItem(R.drawable.bot_tayeb,"Lt. Gen. Abu Tayeb Md Zahirul Alam (Retd.)","Member"));
        items.add(new ListItem(R.drawable.bot_ali,"Prof. Liaquat Ali","Member\n"  + "Vice Chancellor\n"  + "Bangladesh University of Health Sciences"));
        items.add(new ListItem(R.drawable.bot_mahmud,"Prof. Dr. Mahmud Hasan","Member\n"  + "Former Vice Chancellor of Bangabandhu Sheikh\n" + "Mujib Medical University (BSMMU)"));
        items.add(new ListItem(R.drawable.bot_pran,"Prof. Pran Gopal Datta","Member\n"  + "Former Vice Chancellor of Bangabandhu\n" + " Sheikh Mujib Medical University (BSMMU)"));
        items.add(new ListItem(R.drawable.bot_rafiqul,"Dr. Rafiqul Islam","Member\n"  + "Sr. Director Marketing,\n" + "Hamdard Laboratories (waqf) Bangladesh"));
        items.add(new ListItem(R.drawable.bot_mansur,"Kazi Mansur-Ul-Huq","Member\n"  + "Director Information & Public Relation,\n"  + "Hamdard Laboratories (waqf) Bangladesh"));
        items.add(new ListItem(R.drawable.bot_anisul,"Md. Anisul Hoque","Member\n"  + "Director Finance & Accounts,\n" + "Hamdard Laboratories (waqf) Bangladesh"));
        items.add(new ListItem(R.drawable.bot_shiry,"Prof. Hakim Shiry Farhad","Member\n"  + "Director Administration,\n"  + "Hamdard Laboratories (waqf) Bangladesh"));
        items.add(new ListItem(R.drawable.bot_mahbubul,"Lt. Colonel Mahbubul Alam Chowdhury (Retd)","Member\n"  + "Director, Hamdard Foundation Bangladesh"));
        items.add(new ListItem(R.drawable.bot_iqbal,"Major Iqbal Mahmud Chowdhury, PSC, MBA (Retd)","Member\n"  +"Director, Hamdard University Bangladesh Project"));
        items.add(new ListItem(R.drawable.bot_russell,"Mohammad Zamal Uddin Russell","Member\n"  + "Director, Planning & Development\n"  + "Hamdard Laboratories (waqf) Bangladesh"));
        items.add(new ListItem(R.drawable.bot_nargish,"Dr. Hakim Nargish Marjhan ","Member\n"  + "Director, HRD, Hamdard Laboratories (waqf) Bangladesh"));
        items.add(new ListItem(R.drawable.bot_saifuddin,"Hakim Saifuddin Murad","Member\n"  + "Director, Sales,\n"  + "Hamdard Laboratories (Waqf) Bangladesh"));
        items.add(new ListItem(R.drawable.bot_mihir,"Mihir Chakraborty","Member\n"  + "Director Production, QC, QA and P&D\n"  + "Hamdard Modern Factory"));
        items.add(new ListItem(R.drawable.bot_lutfur,"Mr. Md. Lutfur Rahman","Member Secretary\n"  + "Registrar\n"  + "Hamdard University Bangladesh"));
        ListItemAdaper listItemAdaper = new ListItemAdaper(this,items);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(listItemAdaper);



    }
}
