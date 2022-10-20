package com.taller_st.app_mobile_taller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class RegisterUserActivity extends AppCompatActivity {

    private TextInputEditText txtNombresReg, txtApellidosReg, txtEmailReg, txtPassword1Reg, txtPassword2Reg;
    private Button btnSignUp, btnVolverLog;

    public void init_ui(){
        txtNombresReg = findViewById(R.id.txtNombresReg);
        txtApellidosReg = findViewById(R.id.txtApellidosReg);
        txtEmailReg = findViewById(R.id.txtEmailReg);
        txtPassword1Reg = findViewById(R.id.txtPassword1Reg);
        txtPassword2Reg = findViewById(R.id.txtPassword2Reg);
        btnSignUp = findViewById(R.id.btnSignUp);
        btnVolverLog = findViewById(R.id.btnVolverLog);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);

        init_ui();
    }
}