package com.example.converter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends Activity{
    Spinner spinner1, spinner2;
    EditText editText1, editText2;
    int posFrom;
    int posTo;
    double input;

    String[] symbolMoney = {"USD", "VND", "CNY", "EUR", "GBP", "INR", "IPY", "KRW", "RUB", "SGD"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner1 = findViewById(R.id.spinner1);
        spinner2 = findViewById(R.id.spinner2);
        editText1 = findViewById(R.id.edit_text_1);
        editText2 = findViewById(R.id.edit_text_2);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.text, R.id.text_view, symbolMoney);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, R.layout.text, R.id.text_view, symbolMoney);

        spinner1.setAdapter(adapter);
        spinner2.setAdapter(adapter1);
        spinner2.setSelection(1);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                posFrom = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                posTo = position;
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        findViewById(R.id.button_clear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText("");
                editText2.setText("");
            }
        });
        findViewById(R.id.button_convert).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    input = Double.parseDouble(editText1.getText().toString());
                    if (symbolMoney[posFrom].equals("USD")){
                        USD usd = new USD(input);
                        editText2.setText(String.valueOf(usd.toMoney(symbolMoney[posTo])));
                    }
                    if (symbolMoney[posFrom].equals("CNY")){
                        CNY cny = new CNY(input);
                        editText2.setText(String.valueOf(cny.toMoney(symbolMoney[posTo])));
                    }
                    if (symbolMoney[posFrom].equals("EUR")){
                        EUR eur = new EUR(input);
                        editText2.setText(String.valueOf(eur.toMoney(symbolMoney[posTo])));
                    }
                    if (symbolMoney[posFrom].equals("GBP")){
                        GBP gbp = new GBP(input);
                        editText2.setText(String.valueOf(gbp.toMoney(symbolMoney[posTo])));
                    }
                    if (symbolMoney[posFrom].equals("INR")){
                        INR inr = new INR(input);
                        editText2.setText(String.valueOf(inr.toMoney(symbolMoney[posTo])));
                    }
                    if (symbolMoney[posFrom].equals("JPY")){
                        JPY jpy = new JPY(input);
                        editText2.setText(String.valueOf(jpy.toMoney(symbolMoney[posTo])));
                    }
                    if (symbolMoney[posFrom].equals("KRW")){
                        KRW krw = new KRW(input);
                        editText2.setText(String.valueOf(krw.toMoney(symbolMoney[posTo])));
                    }
                    if (symbolMoney[posFrom].equals("RUB")){
                        RUB rub = new RUB(input);
                        editText2.setText(String.valueOf(rub.toMoney(symbolMoney[posTo])));
                    }
                    if (symbolMoney[posFrom].equals("SGD")){
                        SGD sgd = new SGD(input);
                        editText2.setText(String.valueOf(sgd.toMoney(symbolMoney[posTo])));
                    }
                    if (symbolMoney[posFrom].equals("VND")){
                        VND vnd = new VND(input);
                        editText2.setText(String.valueOf(vnd.toMoney(symbolMoney[posTo])));
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}