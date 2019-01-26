package com.drimcell.hub;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class BusTrackerActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    Marker busMarker101,busMarker102;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference101,databaseReference102;
    private String location101 ="23.598267,90.619786";
    private String location102 ="23.598272,90.620081";
    private double latitude101 = 23.598267;
    private double logitude101 = 90.619786;
    private double latitude102 = 23.598272;
    private double logitude102 = 90.620081;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_tracker);

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference101 = firebaseDatabase.getReference("BUS101");
        databaseReference102 = firebaseDatabase.getReference("BUS102");

        databaseReference101.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                location101 = dataSnapshot.getValue(String.class);
                String[] seperator = location101.split(",");
                latitude101 = Double.parseDouble(seperator[0].trim());
                logitude101 = Double.parseDouble(seperator[1].trim());

                busMarker101.remove();
                updateBusMarker101();

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        databaseReference102.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                location102 = dataSnapshot.getValue(String.class);
                String[] seperator = location102.split(",");
                latitude102 = Double.parseDouble(seperator[0].trim());
                logitude102 = Double.parseDouble(seperator[1].trim());
                //Toast.makeText(BusTrackerActivity.this, location102, Toast.LENGTH_SHORT).show();

                busMarker102.remove();
                updateBusMarker102();

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng cameraLatLng = new LatLng(23.639490,90.592744);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(cameraLatLng));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(12.0f));
        updateBusMarker101();
        updateBusMarker102();


    }

    private void updateBusMarker101(){

        LatLng bus101 = new LatLng(latitude101, logitude101);

        busMarker101 = mMap.addMarker(new MarkerOptions().position(bus101).title("BUS 1")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_marker)));


    }
    private void updateBusMarker102(){

        LatLng bus102 = new LatLng(latitude102, logitude102);
        busMarker102 = mMap.addMarker(new MarkerOptions().position(bus102)
                .title("BUS 2") .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_marker)));

    }


}
