package com.example.discrollview;

/**
 * Created by HP on 23-06-2017.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ClinicFragment extends Fragment {

    private GoogleMap mMap;

    public static ClinicFragment newInstance() {
        ClinicFragment fragment = new ClinicFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main, null, false);

        toast("Working till here");
        SupportMapFragment mapFragment = (SupportMapFragment) this.getChildFragmentManager()
                .findFragmentById(R.id.mapV);
        mapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap) {
                mMap = googleMap;
                if(mMap != null)
                {
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(
                            new LatLng(28.5456, 77.2732), 12));

                    mMap.addMarker(new MarkerOptions()
                            .position(new LatLng(28.5456, 77.2732))
                            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
                }
                else{
                    getActivity().finish();
                    System.exit(0);
                    Log.d("HGFDD", "Google maps suck");
                }

            }
        });


        return view;
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
//    @Override
//    public void onMapReady(GoogleMap googleMap) {
//        toast("Map is ready");
//        mMap = googleMap;
//
//        // Add a marker in Sydney and move the camera
//        LatLng iiitd = new LatLng(28.5456, 77.2732);
//        if (mMap != null) {
//            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(
//                    new LatLng(28.5456, 77.2732), 12));
//
//            mMap.addMarker(new MarkerOptions()
//                    .position(new LatLng(28.5456, 77.2732))
//                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
//
//            Toast.makeText(getContext(), "working", Toast.LENGTH_LONG).show();
//        }
//    }

    private void toast(String text) {
        Toast toast = Toast.makeText(getActivity(), text, Toast.LENGTH_SHORT);
        toast.show();
    }

}