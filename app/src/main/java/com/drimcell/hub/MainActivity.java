package com.drimcell.hub;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    String[] name = {
            "About",
            "Admission",
            "Programs",
            "Authorities",
            "Library",
            "Cafeteria",
            "Transport",
            "Hostel",
            "Map",
            "Notice",
            "News",
            "Contact",

    } ;

    int[] imageId = {
            R.drawable.icon_hub,
            R.drawable.icon_admission,
            R.drawable.icon_programs,
            R.drawable.icon_person,
            R.drawable.icon_library,
            R.drawable.icon_cafe,
            R.drawable.icon_transport,
            R.drawable.icon_hostel,
            R.drawable.icon_map,
            R.drawable.icon_notice,
            R.drawable.icon_news,
            R.drawable.icon_contact,

    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        GridView gridview = (GridView) findViewById(R.id.gridView);

        GridAdapter gridAdapter = new GridAdapter(MainActivity.this, name, imageId);

        gridview.setAdapter(gridAdapter);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

               switch (position) {

                   case 0:
                   Intent aboutIntent = new Intent(MainActivity.this, About.class);
                   startActivity(aboutIntent);
                       break;

                   case 1:
                       Intent admissionIntent = new Intent(MainActivity.this, Admission.class);
                       startActivity(admissionIntent);
                       break;

                   case 2:
                       Intent programsIntent = new Intent(MainActivity.this, Programs.class);
                       startActivity(programsIntent);
                       break;

                   case 3:
                       Intent authoritiesIntent = new Intent(MainActivity.this, Authorities.class);
                       startActivity(authoritiesIntent);
                       break;

                   case 4:
                       Intent libraryIntent = new Intent(MainActivity.this, Library.class);
                       startActivity(libraryIntent);
                       break;

                   case 5:
                       Intent cafeIntent = new Intent(MainActivity.this, Cafe.class);
                       startActivity(cafeIntent);
                       break;

                   case 6:
                       Intent transportIntent = new Intent(MainActivity.this, Transport.class);
                       startActivity(transportIntent);
                       break;

                   case 7:
                       Intent hostelIntent = new Intent(MainActivity.this, Hostel.class);
                       startActivity(hostelIntent);
                       break;

                   case 8:
                       Intent mapIntent = new Intent(MainActivity.this, MapsActivity.class);
                       startActivity(mapIntent);
                       break;

                   case 9:
                       Intent noticeIntent = new Intent(MainActivity.this, Notice.class);
                       startActivity(noticeIntent);
                       break;

                   case 10:
                       Intent newsIntent = new Intent(MainActivity.this, News.class);
                       startActivity(newsIntent);
                       break;

                   case 11:
                       Intent contIntent = new Intent(MainActivity.this, Contact.class);
                       startActivity(contIntent);
                       break;

                   default:
                       break;
               }

            }
        });


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.about_this_app) {
            Intent aboutThisAppIntent = new Intent(MainActivity.this, AboutThisApp.class);
            startActivity(aboutThisAppIntent);
        }

        if (id == R.id.visit_website) {
            Intent visitWebsiteIntent = new Intent(MainActivity.this, VisitWebsite.class);
            startActivity(visitWebsiteIntent);
        }

        return super.onOptionsItemSelected(item);
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.miabout) {
            Intent aboutIntent = new Intent(MainActivity.this, About.class);
            startActivity(aboutIntent);

        } else if (id == R.id.miAdmission) {
            Intent admissionIntent = new Intent(MainActivity.this, Admission.class);
            startActivity(admissionIntent);

        } else if (id == R.id.miPrograms) {
            Intent programsIntent = new Intent(MainActivity.this, Programs.class);
            startActivity(programsIntent);

        } else if (id == R.id.miAuthority) {
            Intent authoritiesIntent = new Intent(MainActivity.this, Authorities.class);
            startActivity(authoritiesIntent);

        } else if (id == R.id.miLibrary) {
            Intent libraryIntent = new Intent(MainActivity.this, Library.class);
            startActivity(libraryIntent);

        } else if (id == R.id.miCafe) {
            Intent cafeIntent = new Intent(MainActivity.this, Cafe.class);
            startActivity(cafeIntent);

        }else if (id == R.id.miTransport) {
            Intent transportIntent = new Intent(MainActivity.this, Transport.class);
            startActivity(transportIntent);


        }else if (id == R.id.miHostel) {
            Intent hostelIntent = new Intent(MainActivity.this, Hostel.class);
            startActivity(hostelIntent);


        }else if (id == R.id.miMap) {
            Intent mapIntent = new Intent(MainActivity.this, MapsActivity.class);
            startActivity(mapIntent);


        }else if (id == R.id.miNotice) {
            Intent noticeIntent = new Intent(MainActivity.this, Notice.class);
            startActivity(noticeIntent);


        }else if (id == R.id.miNews) {
            Intent newsIntent = new Intent(MainActivity.this, News.class);
            startActivity(newsIntent);


        }else if (id == R.id.miContact) {
            Intent contIntent = new Intent(MainActivity.this, Contact.class);
            startActivity(contIntent);


        }



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



}
