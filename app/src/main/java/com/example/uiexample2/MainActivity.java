package com.example.uiexample2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    private RadioGroup radioGroup;

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
    }
}