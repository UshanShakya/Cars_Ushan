package com.example.car_ushan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etMake, etYear, etColor, etPrice, etEngine;
    TextView etAnswer;

    Button btnCar, btnDiesel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMake= findViewById(R.id.etMake);
        etYear= findViewById(R.id.etYear);
        etColor= findViewById(R.id.etColor);
        etPrice= findViewById(R.id.etPrice);
        etEngine= findViewById(R.id.etEngine);
        etAnswer= findViewById(R.id.etAnswer);

        btnCar= findViewById(R.id.btnCar);
        btnDiesel= findViewById(R.id.btnDiesel);


        final int[] count = {0};

        btnCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String make, year, color, price, engine;

                make= etMake.getText().toString();
                year= etYear.getText().toString();
                color= etColor.getText().toString();
                price= etPrice.getText().toString();
                engine= etEngine.getText().toString();
                count[0] = count[0] +1;

                CreateCar createCar = new CreateCar(make,year,color,price,engine, count[0]);
                etAnswer.setText(etAnswer.getText()+createCar.CreatesCar());



            }
        });
        btnDiesel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String make, year, color, price, engine;

                make= etMake.getText().toString();
                year= etYear.getText().toString();
                color= etColor.getText().toString();
                price= etPrice.getText().toString();
                engine= etEngine.getText().toString();
                count[0] = count[0] +1;

                CreateCar createCar = new CreateCar(make,year,color,price,engine, count[0]);
                etAnswer.setText(etAnswer.getText()+createCar.CreatesCar());
            }
        });

    }
}
