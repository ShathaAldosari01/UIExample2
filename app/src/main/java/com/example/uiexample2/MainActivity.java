package com.example.uiexample2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    private RadioGroup radioGroup;
    private ProgressBar progressBar;

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        switch (i){
            case R.id.man:
                Toast.makeText(this, "my Man", Toast.LENGTH_SHORT).show();
                break;
            case R.id.weman:
                Toast.makeText(this, "hello beautiful!", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.ganderRadio);
        radioGroup.setOnCheckedChangeListener(this);

        //know who checked?
        int rid = radioGroup.getCheckedRadioButtonId();

//          /*other way to do it*/
//        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup radioGroup, int i) {
//                switch (i){
//                    case R.id.man:
//                        Toast.makeText(MainActivity.this, "my Man", Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.weman:
//                        Toast.makeText(MainActivity.this, "hello beautiful!", Toast.LENGTH_SHORT).show();
//                        break;
//                }
//            }
//        });

        progressBar = findViewById(R.id.progressPar);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i< 10; i++){
                    progressBar.incrementProgressBy(10);
                    SystemClock.sleep(500);
                }
            }
        });
        thread.start();

        //get progras, don't forget to store it in varble
        progressBar.getProgress();
    }
}