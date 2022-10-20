package com.taller_st.app_mobile_taller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.textfield.TextInputEditText;
import com.google.gson.Gson;
import com.taller_st.app_mobile_taller.modelos.Category;
import com.taller_st.app_mobile_taller.modelos.Languaje;
import com.taller_st.app_mobile_taller.modelos.Project;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class EditProjectActivity extends AppCompatActivity {

    private TextInputEditText txtNombreEdit, txtDescripcionEdit, txtRepoEdit;
    private Spinner spCatEdit,spLengEdit;
    private Button btnGuardarEdit, btnEliminar;


    public void init_ui(){
        txtNombreEdit = findViewById(R.id.txtNombreEdit);
        txtDescripcionEdit = findViewById(R.id.txtDescripcionEdit);
        txtRepoEdit = findViewById(R.id.txtRepoEdit);
        spCatEdit = findViewById(R.id.spCatEdit);
        spLengEdit = findViewById(R.id.spLengEdit);
        btnGuardarEdit = findViewById(R.id.btnGuardarEdit);
        btnEliminar = findViewById(R.id.btnEliminar);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_project);
        init_ui();




    }
}