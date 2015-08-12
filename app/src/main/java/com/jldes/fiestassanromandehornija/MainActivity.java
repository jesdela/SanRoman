package com.jldes.fiestassanromandehornija;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout mapa = (RelativeLayout)findViewById(R.id.boton_mapa);
        RelativeLayout programa = (RelativeLayout)findViewById(R.id.boton_programa);
//        RelativeLayout toros = (RelativeLayout)findViewById(R.id.boton_toros);
        mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Mapa.class));
            }
        });
        programa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Programa.class));
            }
        });
//        toros.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this,Toros.class));
//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_TEXT, "¡Vive las Fiestas de San Román de Hornija desde tu móvil! https://play.google.com/store/apps/details?id=com.jldes.fiestassanromandehornija");
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Fiestas de San Román de Hornija");
            startActivity(Intent.createChooser(intent, getString(R.string.app_name)));
        }

        return super.onOptionsItemSelected(item);
    }
}
