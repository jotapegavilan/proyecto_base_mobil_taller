package com.taller_st.app_mobile_taller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.gson.Gson;
import com.taller_st.app_mobile_taller.adaptadores.ProjectAdapter;
import com.taller_st.app_mobile_taller.modelos.Project;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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