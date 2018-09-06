package com.example.samuel.myapp01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "ActivityMain";
    public EditText txtLogin;
    public EditText txtSenha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtLogin = findViewById(R.id.txtLogin);
        txtSenha = findViewById(R.id.txtSenha);
        Log.d(TAG, "onCreate");
    }

    public void login(View view){
        if(txtLogin.getText().toString().isEmpty() || txtSenha.getText().toString().isEmpty()){
            Toast toast = Toast.makeText(getApplicationContext(), "Escreva seu Login e Senha!", Toast.LENGTH_SHORT);
            toast.show();
        } else {
            Intent intent = new Intent(this, SecondaryActivity.class);
            startActivity(intent);
            Toast toast = Toast.makeText(getApplicationContext(), "Login feito com sucesso!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }
}
