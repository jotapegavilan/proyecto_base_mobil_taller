package com.taller_st.app_mobile_taller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HomeActivity extends AppCompatActivity {
    private FloatingActionButton fbtnAgregar;
    private TextView txtPresentacion;
    private Button btnPerfil;
    private RecyclerView recyclerView;

    public void init_ui(){
        fbtnAgregar = findViewById(R.id.fbtnAgregar);
        txtPresentacion = findViewById(R.id.txtPresentacion);
        btnPerfil = findViewById(R.id.btnPerfil);
        recyclerView = findViewById(R.id.recyclerView);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        init_ui();

    }
}