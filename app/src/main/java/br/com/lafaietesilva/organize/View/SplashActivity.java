package br.com.lafaietesilva.organize.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import br.com.lafaietesilva.organize.R;

public class SplashActivity extends AppCompatActivity {

    private static final String TAG = "ORGANIZE";
    long timeLoad = 1000 * 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Log.d(TAG,"Iniciando Splash");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.d(TAG,"Chamado Activy");
                carregaActivy();
            }
        },timeLoad);
    }

    private void carregaActivy() {
        Intent telaActivy = new Intent(SplashActivity.this,LoginActivity.class);
        startActivity(telaActivy);
        finish();
    }
}