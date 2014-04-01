package com.example.activitydemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class ActivityDemoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//      Classe android.util.Log. La classe contiene dei metodi statici per scrivere nel log di sistema.
//      Il metodo i() salva delle righe di log di livello INFO. Altri metodi disponibili sono v() per il
//      livello VERBOSE, d() per il livello DEBUG, w() per il livello WARN, ed e() per il livello ERROR.
        Log.i("ActivityDemo", "Richiamato onCreate() con bundle " + savedInstanceState);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ActivityDemo", "Richiamato onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ActivityDemo", "Richiamato onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ActivityDemo", "Richiamato onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ActivityDemo", "Richiamato onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ActivityDemo", "Richiamato onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ActivityDemo", "Richiamato onDestroy()");
    }
}
