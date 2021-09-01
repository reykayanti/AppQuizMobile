package com.perkuliahan.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioGroup rg_satu = (RadioGroup)findViewById(R.id.rgsatu);
        final RadioGroup rg_dua = (RadioGroup)findViewById(R.id.rgdua);
        final RadioGroup rg_tiga = (RadioGroup)findViewById(R.id.rgtiga);
        final RadioGroup rg_empat = (RadioGroup)findViewById(R.id.rgempat);
        final RadioGroup rg_lima = (RadioGroup)findViewById(R.id.rglima);
        final RadioGroup rg_enam = (RadioGroup)findViewById(R.id.rgenam);
        final RadioGroup rg_tujuh = (RadioGroup)findViewById(R.id.rgtujuh);
        final RadioGroup rg_del = (RadioGroup)findViewById(R.id.rgdel);
        final RadioGroup rg_sem = (RadioGroup)findViewById(R.id.rgsem);
        final RadioGroup rg_sep = (RadioGroup)findViewById(R.id.rgsep);

        Button buttonsubmit =(Button)findViewById(R.id.btnsubmit);
        buttonsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int nilaisatu, nilaidua, nilaitiga, nilaiempat, nilailima,
                        nilaienam, nilaitujuh, nilaidel, nilaisem, nilaisep,
                        hasilnilai;

                RadioGroup rgsatu = (RadioGroup)findViewById(R.id.rgsatu);
                int satu = rg_satu.getCheckedRadioButtonId();
                if (satu == R.id.satuc){
                    nilaisatu = 10;
                } else{
                    nilaisatu = 0;
                }

                RadioGroup rgdua = (RadioGroup)findViewById(R.id.rgdua);
                int dua = rg_dua.getCheckedRadioButtonId();
                if (dua == R.id.duaa){
                    nilaidua = 10;
                } else{
                    nilaidua = 0;
                }
                RadioGroup rgtiga = (RadioGroup)findViewById(R.id.rgtiga);
                int tiga = rg_tiga.getCheckedRadioButtonId();
                if (tiga == R.id.tigaa){
                    nilaitiga = 10;
                } else {
                    nilaitiga = 0;
                }

                RadioGroup rgempat = (RadioGroup)findViewById(R.id.rgempat);
                int empat = rg_empat.getCheckedRadioButtonId();
                if (empat == R.id.empatb){
                    nilaiempat = 10;
                } else {
                    nilaiempat = 0;
                }

                RadioGroup rglima = (RadioGroup)findViewById(R.id.rglima);
                int lima = rg_lima.getCheckedRadioButtonId();
                if (lima == R.id.limab){
                    nilailima = 10;
                } else {
                    nilailima = 0;
                }

                RadioGroup rgenam = (RadioGroup)findViewById(R.id.rgenam);
                int enam = rg_enam.getCheckedRadioButtonId();
                if (enam == R.id.enamc){
                    nilaienam = 10;
                } else {
                    nilaienam = 0;
                }

                RadioGroup rgtujuh = (RadioGroup)findViewById(R.id.rgtujuh);
                int tujuh = rg_tujuh.getCheckedRadioButtonId();
                if (tujuh == R.id.tujuha){
                    nilaitujuh = 10;
                } else {
                    nilaitujuh = 0;
                }

                RadioGroup rgdel = (RadioGroup)findViewById(R.id.rgdel);
                int del = rg_del.getCheckedRadioButtonId();
                if (del == R.id.delb){
                    nilaidel = 10;
                } else {
                    nilaidel = 0;
                }

                RadioGroup rgsem = (RadioGroup)findViewById(R.id.rgsem);
                int sem = rg_sem.getCheckedRadioButtonId();
                if (sem == R.id.sema){
                    nilaisem = 10;
                } else {
                    nilaisem = 0;
                }

                RadioGroup rgsep = (RadioGroup)findViewById(R.id.rgsep);
                int sep = rg_sep.getCheckedRadioButtonId();
                if (sep == R.id.sepa){
                    nilaisep = 10;
                } else {
                    nilaisep = 0;
                }

                hasilnilai = nilaisatu + nilaidua + nilaitiga + nilaiempat + nilailima + nilaienam
                + nilaitujuh + nilaidel + nilaisem + nilaisep;

                Intent i = new Intent(MainActivity.this, MainHasil.class);
                i.putExtra("hasilnilai", hasilnilai);
                startActivity(i);
            }
        });
    }
}