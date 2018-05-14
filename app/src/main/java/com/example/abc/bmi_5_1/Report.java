package com.example.abc.bmi_5_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Report extends AppCompatActivity implements View.OnClickListener{

    private TextView result;
    private TextView suggest;
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        findViews();
        setListeners();
        calc();
    }


    private void findViews(){

        result = findViewById(R.id.result);
        suggest = findViewById(R.id.suggest);
        back = findViewById(R.id.back);
    }

    private void setListeners(){

        back.setOnClickListener(this);
    }


    private void calc(){


        DecimalFormat df = new DecimalFormat("0.00");

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        double height = Double.parseDouble(bundle.getString("KEY_HEIGHT")) / 100;
        double weight = Double.parseDouble(bundle.getString("KEY_WEIGHT"));
        double BMI = weight / (height * height);

        result.setText("你的BMI值 = " + df.format(BMI));

        if (BMI > 25)
            suggest.setText(R.string.advice_heavy);
        else if (BMI < 20)
            suggest.setText(R.string.advice_light);
        else
            suggest.setText(R.string.advice_average);
    }


    @Override
    public void onClick(View v) {
        finish();
    }
}
