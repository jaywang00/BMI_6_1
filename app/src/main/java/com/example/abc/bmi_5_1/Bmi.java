package com.example.abc.bmi_5_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Bmi extends AppCompatActivity implements View.OnClickListener {

    private EditText field_height;
    private EditText field_weight;
    private Button submit;
    private TextView result;
    private TextView suggest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        findViews();
        setListeners();
    }

    private void findViews(){
        submit = findViewById(R.id.submit);
        field_height = findViewById(R.id.field_height);
        field_weight = findViewById(R.id.field_weight);
        result = findViewById(R.id.result);
        suggest = findViewById(R.id.suggest);
    }

    private void setListeners(){
        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
//        DecimalFormat df = new DecimalFormat("0.00");
//
//        double height = Double.parseDouble(field_height.getText().toString()) / 100;
//        double weight = Double.parseDouble(field_weight.getText().toString());
//        double BMI = weight / (height * height);
//
//        result.setText("你的BMI值 = " + df.format(BMI));
//
//        if (BMI > 25)
//            suggest.setText(R.string.advice_heavy);
//        else if (BMI < 20)
//            suggest.setText(R.string.advice_light);
//        else
//            suggest.setText(R.string.advice_average);

        Intent intent = new Intent();
        intent.setClass(Bmi.this,Report.class);
        startActivity(intent);
    }
}