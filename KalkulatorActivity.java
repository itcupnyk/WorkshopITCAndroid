package com.example.asus.pertemuansatubidmis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KalkulatorActivity extends AppCompatActivity {

    private Button btnProses;
    private EditText etNilaiA,etNilaiB;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        btnProses = findViewById(R.id.btn_proses);
        etNilaiA = findViewById(R.id.et_nilai_a);
        etNilaiB = findViewById(R.id.et_nilai_b);
        tvHasil = findViewById(R.id.tv_hasil);

        btnProses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sNilaiA = etNilaiA.getText().toString();
                    String sNilaiB = etNilaiB.getText().toString();

                    double dNilaiA = Double.parseDouble(sNilaiA);
                    double dNilaiB = Double.parseDouble(sNilaiB);

                    double dHasil = dNilaiA + dNilaiB;

                    String sHasil = String.valueOf(dHasil);


                    tvHasil.setText(sHasil);


                }catch (Exception e){

                }
            }
        });

    }
}
