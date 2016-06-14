package com.example.kands.aplicacionregistro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    String almacenar="";
    EditText TxtNombre;
    EditText TxtApellido;
    Button BtnAdicionar;
    Button BtnListar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //recordar que los nombres en el archivo java y en el archivo xml no necesariamente tienen
        //que ser el mismo, como ejemplo dejamos el TxtNombre
        TxtNombre = (EditText)findViewById(R.id.TxtNombrenonecesariamenteelmismonombre);
        TxtApellido = (EditText)findViewById(R.id.TxtApellido);
        BtnAdicionar = (Button)findViewById(R.id.BtnAdicionar);
        BtnListar = (Button)findViewById(R.id.BtnListar);

        BtnAdicionar.setOnClickListener(this);
        BtnListar.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {


        switch (v.getId()){
            case R.id.BtnAdicionar:
                almacenar = almacenar +" "+TxtNombre.getText().toString()+" "+TxtApellido.getText().toString()+"\n";
                //Toast.makeText(getApplicationContext(), almacenar,Toast.LENGTH_SHORT).show();
                break;
            case R.id.BtnListar:
                Toast.makeText(getApplicationContext(),almacenar,Toast.LENGTH_LONG).show();
                break;

        }

    }

}
