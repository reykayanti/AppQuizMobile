package com.perkuliahan.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainHasil extends AppCompatActivity {

    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_hasil);

        Integer hasilnilai = getIntent().getExtras().getInt("hasilnilai");

        result = findViewById(R.id.textHasil);
        result.setText(" " + hasilnilai);

    }
}