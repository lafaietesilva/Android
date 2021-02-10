package br.com.lafaietesilva.organize.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import br.com.lafaietesilva.organize.R;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "ORGANIZE";
    FloatingActionButton btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"Abrindo o Activity");

        btnAdd = findViewById(R.id.btnAdd);
    }
}