package com.example.solene.galidog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textStart;
    private Button btnNewPath;
    private Button btnOldPath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        if (intent != null){

            textStart = (TextView) findViewById(R.id.activity_main_text_start);
            btnNewPath = (Button) findViewById(R.id.activity_main_btn_new);
            btnOldPath = (Button) findViewById(R.id.activity_main_btn_old);

            btnNewPath.setOnClickListener(new View.OnClickListener() {
                @Override
                /* L'utilisateur souhaite enregistrer un nouveau chemin, accès à l'activité correspondante */
                public void onClick(View v) {
                    Intent intentMapsActivity = new Intent(MainActivity.this, MapsActivity.class);
                    startActivity(intentMapsActivity);
                }
            });

            if (intent.hasExtra("donnees")){
                Bundle bundle = getIntent().getExtras();
                final TransfertDonnees donnees = bundle.getParcelable("donnees");

                Log.i("salut", "salut, je suis rentré dans le if");

                btnOldPath.setOnClickListener(new View.OnClickListener() {
                    @Override
                    /* L'utilisateur souhaite accéder au chemin enregistré, accès à l'activité correspondante */
                    public void onClick(View v) {
                        Log.i("salut", "salut, je suis rentré dans l'appel à l'activité");
                        Intent intentOldMapsActivity = new Intent(MainActivity.this, OldMapsActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("donnees", donnees);
                        intentOldMapsActivity.putExtras(bundle);
                        startActivity(intentOldMapsActivity);
                    }
                });
            }





        }

        }



}
