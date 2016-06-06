package com.example.joao.testevideoaulanovas;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Dulu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dulu = (Button)findViewById(R.id.buttonMostrar);

    }
    public void mostrardialogo(View view){
        AlertDialog AlertDialog;
        AlertDialog = new AlertDialog.Builder(this).create();
        AlertDialog.setTitle("Palestra sobre Graduações em TI.");
        AlertDialog.setMessage("Baita Palestra");
        AlertDialog.show();

    }

}
