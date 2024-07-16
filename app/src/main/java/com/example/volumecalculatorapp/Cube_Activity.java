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

public class Cube_Activity extends AppCompatActivity {
    TextView text_cube,text2_cube;
    EditText editText_cube;
    Button btn_cube;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cube);
        text_cube=findViewById(R.id.text_cube);
        text2_cube=findViewById(R.id.text2_cube);
        editText_cube=findViewById(R.id.editText_cube);
        btn_cube=findViewById(R.id.btn_cube);

        btn_cube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String side= editText_cube.getText().toString();
                Double a=Double.parseDouble(side);

                double Volume=a*a*a;
                text2_cube.setText("Volume: "+Volume+" m^3");
            }
        });

    }
}