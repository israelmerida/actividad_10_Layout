package com.example.listcalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_number1;
    EditText et_number2;
    EditText et_resultado;

    double numero1;
    double numero2;
    double resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
    }
    private void initComponents(){
        et_number1 = (EditText)findViewById(R.id.et_numero1);
        et_number2 = (EditText)findViewById(R.id.et_numero2);
        et_resultado = (EditText)findViewById(R.id.et_resultado);
    }

    private void valuesCasting(){
        numero1 = Double.parseDouble(et_number1.getText().toString());
        numero2 = Double.parseDouble(et_number2.getText().toString());
    }

    public void sumaOnClick(View view){
        try{
            valuesCasting();
            resultado = numero1 + numero2;
            et_resultado.setText(String.valueOf(resultado));
        }catch (Exception e){
            Log.e("Error add:", "Message " + e.getMessage());
            et_resultado.setText("Error");
        }
    }
    public void restaOnClick(View view){
        try{
            valuesCasting();
            resultado = numero1 - numero2;
            et_resultado.setText(String.valueOf(resultado));
        }catch (Exception e){
            Log.e("Error rest:", "Message " + e.getMessage());
            et_resultado.setText("Error");
        }
    }
    public void divisionOnClick(View view){
        try{
            valuesCasting();
            resultado = numero1 / numero2;
            et_resultado.setText(String.valueOf(resultado));
        }catch (Exception e){
            Log.e("Error division:", "Message " + e.getMessage());
            et_resultado.setText("Error");
        }
    }
    public void multiplicacionOnClick(View view){
        try{
            valuesCasting();
            resultado = numero1 * numero2;
            et_resultado.setText(String.valueOf(resultado));
        }catch (Exception e){
            Log.e("Error multiplication:", "Message " + e.getMessage());
            et_resultado.setText("Error");
        }
    }
    public void moduloOnClick(View view){
        try{
            valuesCasting();
            resultado = numero1 % numero2;
            et_resultado.setText(String.valueOf(resultado));
        }catch (Exception e){
            Log.e("Error module:", "Message " + e.getMessage());
            et_resultado.setText("Error");
        }
    }
}
