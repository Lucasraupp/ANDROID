package com.moreira.joao.palestraulbra;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View.OnLongClickListener;
import android.widget.*;
import android.view.View;

import java.security.MessageDigest;
import java.security.PublicKey;

public class Menu extends AppCompatActivity {

    private EditText edtNome;
    private Button btnOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        edtNome = (EditText) findViewById(R.id.edtNome);
        btnOK = (Button) findViewById(R.id.btnOK);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder dlg = new AlertDialog.Builder(Menu.this);
            dlg.setMessage(edtNome.getText().toString());
                dlg.setNeutralButton("OK",null);
                dlg.show();

            }

        });
    }
}