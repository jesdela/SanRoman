package com.jldes.fiestassanromandehornija;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
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
                .target(new LatLng(41.4806641, -5.2848909))   //Centramos el mapa en San Roman
                .zoom(16)         //Establecemos el zoom en 19
                .build();

        CameraUpdate camUpd3 =
                CameraUpdateFactory.newCameraPosition(camPos);

        mMap.animateCamera(camUpd3);
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.48115, -5.28449)).title("El Bureo").icon(BitmapDescriptorFactory
                .fromResource(R.mipmap.marcador_bureo )));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.481986,-5.282492)).title("Los Alegales").icon(BitmapDescriptorFactory
                .fromResource(R.mipmap.marcador_alegales)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.4835444,-5.2824427)).title("Tiberio").icon(BitmapDescriptorFactory
                .fromResource(R.mipmap.marcador_tiberio)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.48309,-5.28237)).title("Caso Aparte").icon(BitmapDescriptorFactory
                .fromResource(R.mipmap.marcador_caso_aparte)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.4826528,-5.282658)).title("Genijos").icon(BitmapDescriptorFactory
                .fromResource(R.mipmap.marcador_genijos)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.48175,-5.28206)).title("Los Hombres de Lucio").icon(BitmapDescriptorFactory
                .fromResource(R.mipmap.marcador_lucios)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.4817005,-5.2825199)).title("El Apeton").icon(BitmapDescriptorFactory
                .fromResource(R.mipmap.marcador_apeton)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.481876,-5.2831661)).title("Los Yenkos").icon(BitmapDescriptorFactory
                .fromResource(R.mipmap.marcador_yenkos)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.4817005,-5.2830855)).title("Los Monguis").icon(BitmapDescriptorFactory
                .fromResource(R.mipmap.marcador_monguis)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.481531,-5.282996)).title("BB+").icon(BitmapDescriptorFactory
                .fromResource(R.mipmap.marcador_bbmas)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.4819288,-5.2845682)).title("El Espante").icon(BitmapDescriptorFactory
                .fromResource(R.mipmap.marcador_espante)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.48149,-5.28509)).title("La Pelerina").icon(BitmapDescriptorFactory
                .fromResource(R.mipmap.marcador_pelerina)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.48092,-5.28516)).title("El Zarbascazo").icon(BitmapDescriptorFactory
                .fromResource(R.mipmap.marcador_zarbascazo)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.4808884,-5.2873299)).title("El Desmadre").icon(BitmapDescriptorFactory
                .fromResource(R.mipmap.marcador_desmadre)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.4796277,-5.2873597)).title("Plan B").icon(BitmapDescriptorFactory
                .fromResource(R.mipmap.marcador_planb)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.4798201,-5.2870091)).title("El Convento").icon(BitmapDescriptorFactory
                .fromResource(R.mipmap.marcador_convento)));
        mMap.setMyLocationEnabled(true);
    }
}
