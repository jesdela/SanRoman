package com.jldes.fiestassanromandehornija;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Mapa extends FragmentActivity {

    private GoogleMap mMap; // Might be null if Google Play services APK is not available.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
        setUpMapIfNeeded();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }

    /**
     * Sets up the map if it is possible to do so (i.e., the Google Play services APK is correctly
     * installed) and the map has not already been instantiated.. This will ensure that we only ever
     * call {@link #setUpMap()} once when {@link #mMap} is not null.
     * <p/>
     * If it isn't installed {@link SupportMapFragment} (and
     * {@link com.google.android.gms.maps.MapView MapView}) will show a prompt for the user to
     * install/update the Google Play services APK on their device.
     * <p/>
     * A user can return to this FragmentActivity after following the prompt and correctly
     * installing/updating/enabling the Google Play services. Since the FragmentActivity may not
     * have been completely destroyed during this process (it is likely that it would only be
     * stopped or paused), {@link #onCreate(Bundle)} may not be called again so we should call this
     * method in {@link #onResume()} to guarantee that it will be called.
     */
    private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (mMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                    .getMap();
            // Check if we were successful in obtaining the map.
            if (mMap != null) {
                setUpMap();
            }
        }
    }

    /**
     * This is where we can add markers or lines, add listeners or move the camera. In this case, we
     * just add a marker near Africa.
     * <p/>
     * This should only be called once and when we are sure that {@link #mMap} is not null.
     */
    private void setUpMap() {
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        CameraPosition camPos = new CameraPosition.Builder()
                .target(new LatLng(41.4806641, -5.2848909))   //Centramos el mapa en Madrid
                .zoom(16)         //Establecemos el zoom en 19
                .build();

        CameraUpdate camUpd3 =
                CameraUpdateFactory.newCameraPosition(camPos);

        mMap.animateCamera(camUpd3);
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.48115, -5.28449)).title("Bureo"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.481986,-5.282492)).title("Alegales"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.4833657,-5.2824862)).title("Tiberio"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.48309,-5.28237)).title("Caso Aparte"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.4826528,-5.282658)).title("Genijos"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.48175,-5.28206)).title("Los Hombres de Lucio"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.4817005,-5.2825199)).title("El Apeton"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.481876,-5.2831661)).title("Los Yenkos"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.4817005,-5.2830855)).title("Los Monguis"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.481531,-5.282996)).title("BB+"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.4819288,-5.2845682)).title("El Espante"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.48149,-5.28509)).title("La Pelerina"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.48092,-5.28516)).title("El Zarbascazo"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.4808884,-5.2873299)).title("El Desmadre"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.4796277,-5.2873597)).title("Plan B"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.4798201,-5.2870091)).title("El Convento"));
    }
}
