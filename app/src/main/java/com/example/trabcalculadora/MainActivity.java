package com.example.trabcalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button, button2,button3,button4,button5,button6,button7,button8,button9,button10,buttonMais,buttonMenos,buttonVezes,buttonDiv,buttonApagar,buttonIgual,buttonVirgula;

    EditText resultado;

    float valor, valor2;

    boolean Divisao, Multiplicacao, Adicao, Subtracao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonApagar = (Button) findViewById(R.id.buttonApagar);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonIgual = (Button) findViewById(R.id.buttonIgual);
        buttonMais = (Button) findViewById(R.id.buttonMais);
        buttonMenos = (Button) findViewById(R.id.buttonMenos);
        buttonVezes = (Button) findViewById(R.id.buttonVezes);
        buttonVirgula = (Button) findViewById(R.id.buttonVirgula);

        resultado = (EditText) findViewById(R.id.resultado);


        resultado.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable editable) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {

                if(s.length() > 0
                   && s.subSequence(0, s.length()-1).toString().contains(".")
                   && s.toString().charAt(s.length() - 1) == '.')
                {
                    CharSequence text = s.subSequence(0, s.length()-1);
                    resultado.setText(text);
                }
            }
        });



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                resultado.setText(resultado.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText()+"9");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText()+"0");
            }
        });

        buttonVirgula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText()+".");
            }
        });

        buttonVezes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valor = Float.parseFloat(resultado.getText()+"");
                Multiplicacao = true;
                resultado.setText(null);
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valor = Float.parseFloat(resultado.getText() + "");
                Divisao = true;
                resultado.setText(null);
            }
        });

        buttonMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                    valor = Float.parseFloat(resultado.getText()+"");
                    Adicao = true;
                    resultado.setText(null);


            }
        });

        buttonMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valor = Float.parseFloat(resultado.getText()+"");
                Subtracao = true;
                resultado.setText(null);

            }
        });

        buttonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valor2 = Float.parseFloat(resultado.getText()+"");




                if (valor == 0){
                    Toast.makeText(getApplicationContext(),"Digite um numero valido", Toast.LENGTH_SHORT).show();
                }


                else {



                if (Adicao == true){

                    resultado.setText(valor + valor2 +"");
                    Adicao = false;
                }

                if (Subtracao == true){

                    resultado.setText(valor - valor2 + "");
                    Subtracao =  false;

                }

                if (Multiplicacao == true){

                    resultado.setText(valor * valor2 + "");
                    Multiplicacao = false;

                }

                if (Divisao == true){

                    if (valor2 == 0){

                        Toast.makeText(getApplicationContext(), "nao existe divisao por zero", Toast.LENGTH_SHORT).show();
                    }
                    else {

                        resultado.setText(valor / valor2 + "");
                        Divisao = false;

                    }
                    }
            }}
        });



        buttonApagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText("");
            }
        });


    }
}
