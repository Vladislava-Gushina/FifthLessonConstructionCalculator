package com.msaggik.fifthlessonconstructioncalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CalculationMoneyActivity extends AppCompatActivity {
    private EditText wallpaperRoll, constructionGlue, costFurniture, square;
    private Button calculationOfFunds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.money_calculation);

        wallpaperRoll = findViewById(R.id.wallpaperRoll);
        constructionGlue = findViewById(R.id.constructionGlue);
        costFurniture = findViewById(R.id.costFurniture);
        square = findViewById(R.id.square);
        calculationOfFunds = findViewById(R.id.calculationOfFunds);

        calculationOfFunds.setOnClickListener(listener);
    }
    private View.OnClickListener listener = new View.OnClickListener(){

        @Override
        public void onClick(View view) {
            int wallpaperInt = Integer.parseInt(wallpaperRoll.getText().toString());
            int constructionGlueInt = Integer.parseInt(constructionGlue.getText().toString());
            int squareInt = Integer.parseInt(square.getText().toString());
            int calculationOfFundsInt = Integer.parseInt(calculationOfFunds.getText().toString());

            CalculationMoney calculationMoney = new CalculationMoney(wallpaperInt, constructionGlueInt, squareInt, calculationOfFundsInt);

            Toast.makeText(getApplicationContext(), "Вывод: " + calculationMoney.result(), Toast.LENGTH_LONG).show();
        }

    };
}
