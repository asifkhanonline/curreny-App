package com.lco.currency;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button inr,usdollar,yer,cad,euro,clear;
    EditText ed;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inr=findViewById(R.id.INR);
        usdollar=findViewById(R.id.USDOLLAR);
        yer=findViewById(R.id.YER);
        cad=findViewById(R.id.CAD);
        euro=findViewById(R.id.EUR);
        clear=findViewById(R.id.clr);
        inr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float value= Float.parseFloat(ed.getText()+"");
                ed.setText(value/69.5+"");
            }
        });
        usdollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float value= Float.parseFloat(ed.getText()+"");
                ed.setText(value/48.49+"");
            }
        });
    }
}
