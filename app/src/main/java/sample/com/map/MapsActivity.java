package sample.com.map;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap map) {
        // Add a marker in Sydney, Australia, and move the camera.
        if(map!=null){
            LatLng SYDNEY = new LatLng(32.7157,-117.1611);
            CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(SYDNEY, 16);
            map.animateCamera(cameraUpdate);

        }


      //  LatLng sydney = new LatLng(-34, 151);
      //  map.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
      //  map.moveCamera(CameraUpdateFactory.newLatLng(sydney), 10);

    }
}