package br.com.lafaietesilva.organize.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import br.com.lafaietesilva.organize.R;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "ORGANIZE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"Abrindo o activy");
    }
}