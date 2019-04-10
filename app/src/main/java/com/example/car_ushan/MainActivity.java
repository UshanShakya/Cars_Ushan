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

        final int[] count = new int[1];
        btnCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              count[0] = count[0] +1;

                etAnswer.setText(etAnswer.getText()+"The is Vehicle No. "+count[0]+"");
                etAnswer.setText(etAnswer.getText()+" Manufacturer: " +etMake.getText()+" Current Value: "+etPrice.getText()+ " Effective engine Size: "+etEngine.getText());
                etMake.setText(null);
                etYear.setText(null);
                etColor.setText(null);
                etPrice.setText(null);
                etEngine.setText(null);
            }
        });
        btnDiesel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count[0] = count[0] +1;

                etAnswer.setText(etAnswer.getText()+"The is Vehicle No. "+count[0]+"");
                etAnswer.setText(etAnswer.getText()+" Manufacturer: " +etMake.getText()+" Current Value: "+etPrice.getText()+ " Effective engine Size: "+etEngine.getText());
                etMake.setText(null);
                etYear.setText(null);
                etColor.setText(null);
                etPrice.setText(null);
                etEngine.setText(null);
            }
        });

    }
}
