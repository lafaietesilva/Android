package br.com.lafaietesilva.organize.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import br.com.lafaietesilva.organize.R;

public class LoginActivity extends AppCompatActivity {

    private TextInputLayout txtInLoutEmail;
    private TextInputLayout txtInLoutSenha;
    private TextInputEditText edtTxtEmail;
    private TextInputEditText edtTxtSenha;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button = findViewById(R.id.btnLogConfirma);

        txtInLoutEmail = findViewById(R.id.txtlay_email);
        txtInLoutSenha = findViewById(R.id.txtlay_senha);
        edtTxtEmail = findViewById(R.id.edtLogEmail);
        edtTxtSenha = findViewById(R.id.edtLogSenha);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validForm();
                if(!txtInLoutEmail.isErrorEnabled() && !txtInLoutSenha.isErrorEnabled() ){
                    trocatela();
                }

            }
        });

    }

    private void trocatela() {
        Intent intent = new Intent(LoginActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    private void validForm(){
        if(edtTxtEmail.getText().toString().isEmpty()){
            txtInLoutEmail.setErrorEnabled(true);
            txtInLoutEmail.setError("Preenchar seu email");
        }else{
            txtInLoutEmail.setErrorEnabled(false);
        }
        if(edtTxtSenha.getText().toString().isEmpty()){
            txtInLoutSenha.setErrorEnabled(true);
            txtInLoutSenha.setError("Preenchar sua senha");
        }else{
            txtInLoutSenha.setErrorEnabled(false);
        }
    }
}