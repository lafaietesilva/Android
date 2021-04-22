package br.com.lafaietesilva.organize.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import br.com.lafaietesilva.organize.api.ApiUtil;
import br.com.lafaietesilva.organize.control.UsuarioControl;
import br.com.lafaietesilva.organize.model.Usuario;
import br.com.lafaietesilva.organize.R;

public class UsuarioActivity extends AppCompatActivity {

    private TextInputLayout txtlayCadNome;
    private TextInputLayout txtlayCadEmail;
    private TextInputLayout txtlayCadSenha;
    private TextInputLayout txtlayCadCSenha;

    private TextInputEditText edtCadUsuNome;
    private TextInputEditText edtCadUsuEmail;
    private TextInputEditText edtCadUsuSenha;
    private TextInputEditText edtCadUsuCSenha;

    private Usuario usuario;

    private Button button;

    UsuarioControl usuarioControl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);

        Log.d(ApiUtil.TAG,"onCreate: Organize");
        usuarioControl = new UsuarioControl(getApplicationContext());

        button = findViewById(R.id.btnGrvUsu);

        txtlayCadNome = findViewById(R.id.txtlay_cadUsuNome);
        txtlayCadEmail = findViewById(R.id.txtlay_cadUsuEmail);
        txtlayCadSenha = findViewById((R.id.txtlay_cadUsuSenha));
        txtlayCadCSenha = findViewById(R.id.txtlay_cadUsuCSenha);

        edtCadUsuNome = findViewById(R.id.edtCadUsuNome);
        edtCadUsuEmail = findViewById(R.id.edtCadUsuEmail);
        edtCadUsuSenha = findViewById(R.id.edtCadUsuSenha);
        edtCadUsuCSenha = findViewById(R.id.edtCadUsuCSenha);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validform();

                if(!txtlayCadNome.isErrorEnabled() && !txtlayCadEmail.isErrorEnabled() && !txtlayCadSenha.isErrorEnabled() && !txtlayCadCSenha.isErrorEnabled()){
                    if (gravausuario());{
                        trocatela();
                    }
                }

            }

        });


    }

    private void validform() {

        usuario = new Usuario();

        if(edtCadUsuNome.getText().toString().isEmpty()){
            txtlayCadNome.setErrorEnabled(true);
            txtlayCadNome.setError("Preenchar seu Nome");
        }else{
            txtlayCadNome.setErrorEnabled(false);
            usuario.setNome(edtCadUsuNome.getText().toString());
        }

        if(edtCadUsuEmail.getText().toString().isEmpty()){
            txtlayCadEmail.setErrorEnabled(true);
            txtlayCadEmail.setError("Preenchar seu email");
        }else{
            txtlayCadEmail.setErrorEnabled(false);
            usuario.setEmail(edtCadUsuEmail.getText().toString());
        }

        if(edtCadUsuSenha.getText().toString().isEmpty()){
            txtlayCadSenha.setErrorEnabled(true);
            txtlayCadSenha.setError("Preenchar sua senha");
        }else{
            txtlayCadSenha.setErrorEnabled(false);
        }

        if(edtCadUsuCSenha.getText().toString().isEmpty()){
            txtlayCadCSenha.setErrorEnabled(true);
            txtlayCadCSenha.setError("Preenchar sua senha");
        }else{
            txtlayCadCSenha.setErrorEnabled(false);
        }

        if(edtCadUsuSenha.getText().equals(edtCadUsuCSenha.getText())){
            txtlayCadSenha.setErrorEnabled(false);
            txtlayCadCSenha.setErrorEnabled(false);
            usuario.setSenha(edtCadUsuSenha.getText().toString());
        }else{
            txtlayCadSenha.setErrorEnabled(true);
            txtlayCadCSenha.setErrorEnabled(true);
            txtlayCadSenha.setError("As senhas não conferem");
            txtlayCadCSenha.setError("As senhas não conferem");
        }

    }

    private void trocatela(){
        Intent intent = new Intent(UsuarioActivity.this,LoginActivity.class);
        startActivity(intent);
        finish();
    }

    private boolean gravausuario(){
        usuario.incluir();
        return true;
    }
}
