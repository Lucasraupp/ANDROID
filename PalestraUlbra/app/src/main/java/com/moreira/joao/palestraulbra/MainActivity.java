package com.moreira.joao.palestraulbra;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.ThreadPoolExecutor;

public class MainActivity extends Activity {


    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        IniciaSplash();
    }
    public void IniciaSplash(){

        setContentView(R.layout.activity_main);

        new Thread(new Runnable() {


            @Override
            public void run() {

                counter++;

                try {
                    while (counter == 1 || counter <= 5) {

                        Thread.sleep(1000);
                        counter++;

                        Log.e("Counter =", Integer.toString(counter));
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (counter == 6) {
                    Intent it = new Intent(MainActivity.this, Menu.class);
                    startActivity(it);
                    counter++;
                    Log.e("Counter =", Integer.toString(counter));
                }
            }


        }) .start();

    }


}
