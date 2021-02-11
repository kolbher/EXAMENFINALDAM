package com.dam.prueba;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class mapa extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera -12.210502512372186, -76.91090112979558
        LatLng sydney = new LatLng(-12.210502512372186, -76.91090112979558);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Romel tu Local es: Col. MarianQuimper"));

        LatLng panda = new LatLng(-12.190992289138663, -76.97662281431045);
        mMap.addMarker(new MarkerOptions().position(panda).title("Panda tu local es: Col. 23890"));

        LatLng italo = new LatLng(-12.190992289133050, -76.97662281432030);
        mMap.addMarker(new MarkerOptions().position(italo).title("Italo tu local es: Col 2415 Surcquillo"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(panda));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(italo));
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
    }
}