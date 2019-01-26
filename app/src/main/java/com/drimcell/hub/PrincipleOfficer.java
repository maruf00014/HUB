package com.drimcell.hub;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Maruf on 24-Aug-17.
 */

public class PrincipleOfficer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        final ArrayList<ListItem> items = new ArrayList<ListItem>();
        items.add(new ListItem(R.drawable.off_hamid,"Md. Abdul Hamid","Chancellor \n" + "Honorable President\n" + "The People’s Republic of Bangladesh"));
        items.add(new ListItem(R.drawable.off_mannan,"Prof. Md. Abdul Mannan, PhD","Vice Chancellor"));
        items.add(new ListItem(R.drawable.off_lutfur,"Mr. Md. Lutfur Rahman","Registrar\n" + "Formarer Additional Secretary\n" + "Ministry of Public Administration"));
        items.add(new ListItem(R.drawable.off_huda,"Md. Nurul Huda","Controller of Examinations\n" + "Former Joint Secretary of the Government of Bangladesh & Waqf Administrator"));
        items.add(new ListItem(R.drawable.off_mamun,"Muhammad Mahbubul Alam Mamun","Assistant Registrar\n" + "BSc & MSc in CSE"));
        items.add(new ListItem(R.drawable.off_ismail,"Md. Ismail Hossain","Assistant Registrar \n" + "B.A. (Honours) & M.A. in IHC (CU"));
        items.add(new ListItem(R.drawable.off_toffazal,"Md. Tofajjal Hossain","Assistant Registrar\n" + "B.S.S (Honours) and\n" + "M.S.S in Public Administration (DU)"));
        items.add(new ListItem(R.drawable.off_munsi,"Mohammod Jahirul Haque Munshi","Proctor\n" + "BSc (Honours), MSc (Mathematics), MPhil (BUET)\n" + "PhD (Researcher) (BUET)"));
        items.add(new ListItem(R.drawable.off_shabuddin,"Md. Shabuddin","Deputy Director (Finance & Accounts )\n" + "B. Com. (Honours), M.Com. (Accounting), EMBA (IBA,RU), CA (CC)"));
        items.add(new ListItem(R.drawable.off_tahmid,"Tahamid Ebna Rouf","Assistant Controller of Examinations\n" + "BBA & MBA"));
        items.add(new ListItem(R.drawable.off_ali,"Md. Yousuf Ali ","Assistant Librarian\n" + "B.A  (Honours) & M.A. in ISLM (DU)"));
        items.add(new ListItem(R.drawable.off_fazal,"Md Nurul Fazal Sarker","PRO"));




        ListItemAdaper listItemAdaper = new ListItemAdaper(this,items);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(listItemAdaper);



    }
}

