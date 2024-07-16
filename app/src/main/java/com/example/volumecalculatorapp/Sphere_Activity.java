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

public class Sphere_Activity extends AppCompatActivity {
    TextView text_sphere,text2_sphere;
    EditText editText_sphere;
    Button btn_sphere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sphere);
        text_sphere=findViewById(R.id.text_sphere);
        text2_sphere=findViewById(R.id.text2_sphere);
        editText_sphere=findViewById(R.id.editText_sphere);
        btn_sphere=findViewById(R.id.btn_sphere);

        btn_sphere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String Radius= editText_sphere.getText().toString();
                double r=Double.parseDouble(Radius);
                double pi=3.1416;
                Double Volume=(4/3)*pi*r*r*r;
                text2_sphere.setText("Volume :"+Volume+ " M^3");
            }
        });

    }
}