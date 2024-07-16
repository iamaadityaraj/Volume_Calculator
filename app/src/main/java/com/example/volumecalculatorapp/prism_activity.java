package com.example.volumecalculatorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class prism_activity extends AppCompatActivity {
    TextView text_prism,text1_prism;
    EditText editText1_prism,editText2_prism;
    Button btn_prism;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_prism);
        text_prism=findViewById(R.id.text_prism);
        text1_prism=findViewById(R.id.text1_prism);
        editText1_prism=findViewById(R.id.editText1_prism);
        editText2_prism=findViewById(R.id.editText2_prism);
        btn_prism=findViewById(R.id.btn_prism);

        btn_prism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Base=editText1_prism.getText().toString();
                String Height=editText2_prism.getText().toString();

                Double b=Double.parseDouble(Base);
                Double h= Double.parseDouble(Height);

                Double Volume =b*h;
                text1_prism.setText("Volume:"+Volume+"m^3");
            }
        });

    }
}