package com.farhatun.islamku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

    public class malaikat extends AppCompatActivity {
        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_malaikat);

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        @Override
        public boolean onSupportNavigateUp() {
            finish();
            return true;
        }
    }