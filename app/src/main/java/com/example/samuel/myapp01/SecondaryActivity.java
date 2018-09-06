package com.example.samuel.myapp01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class SecondaryActivity extends AppCompatActivity {

    public static final String TAG = "SecondaryActivity";
    public ArrayList<Contato> contatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        setupRecyclerView();
        Log.d(TAG, "onCreate");
    }


    private void setupRecyclerView(){
        RecyclerView rvContatos = (RecyclerView) findViewById(R.id.recycler_view);

        contatos = Contato.createContactsList(20);
        Contato contato = new Contato("Samuel", "9840-1707");
        contatos.add(contato);
        contato = new Contato("Ismael", "8933-4026");
        contatos.add(contato);

        ContatoAdapter adapter = new ContatoAdapter(contatos);

        rvContatos.setAdapter(adapter);
        rvContatos.setLayoutManager(new LinearLayoutManager(this));

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
