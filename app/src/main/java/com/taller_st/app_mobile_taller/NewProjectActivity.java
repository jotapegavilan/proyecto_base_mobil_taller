package com.taller_st.app_mobile_taller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputEditText;


public class NewProjectActivity extends AppCompatActivity {

    private Button btnGuardar;
    private TextInputEditText txtNombre, txtDescripcion, txtRepo;
    private Spinner spCategegorias;
    private Spinner spLenguajes;

    public void init_ui(){
        btnGuardar = findViewById(R.id.btnGuardar);
        txtNombre = findViewById(R.id.txtNombre);
        txtDescripcion = findViewById(R.id.txtDescripcion);
        txtRepo = findViewById(R.id.txtRepo);
        spCategegorias = findViewById(R.id.spCat);
        spLenguajes = findViewById(R.id.spLeng);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_project);
        init_ui();
    }
}