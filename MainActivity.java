package com.example.asus.pertemuansatubidmis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText etUsername, etPassword;
    Button btnLogin;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        btnLogin = findViewById(R.id.btn_login);
        tvHasil = findViewById(R.id.tv_hasil);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    String username = etUsername.getText().toString();
                    String password = etPassword.getText().toString();

                    if (username.equals("admin") && password.equals("admin")){
                        Toast.makeText(MainActivity.this,"Sukses",Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(getApplicationContext(),KalkulatorActivity.class);
                        startActivity(intent);

                    }else{
                        Toast.makeText(MainActivity.this,"Username / Password salah",Toast.LENGTH_SHORT).show();
                    }
                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"Field Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
