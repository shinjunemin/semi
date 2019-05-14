package com.example.billirdproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {
    Button btnLo, btnMem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btnMem = findViewById(R.id.btnMem);

        btnMem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(FirstActivity.this, MainActivity.class);

                startActivity(it);
            }
        });

        btnLo = findViewById(R.id.btnLo);

        btnLo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent it = new Intent(FirstActivity.this,Main2Activity.class);
//
//                startActivity(it);
            }
        });

    }
}
