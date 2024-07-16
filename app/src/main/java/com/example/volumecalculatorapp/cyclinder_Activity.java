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

public class cyclinder_Activity extends AppCompatActivity {
    TextView text_cyclinder,text2_cyclinder;
    EditText editText_cyclinder,editText2_cyclinder;
    Button btn_cyclinder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cyclinder);
        text_cyclinder=findViewById(R.id.text_cyclinder);
        text2_cyclinder=findViewById(R.id.text2_cyclinder);
        editText_cyclinder=findViewById(R.id.editText_cyclinder);
        editText2_cyclinder=findViewById(R.id.editText2_cyclinder);
        btn_cyclinder=findViewById(R.id.btn_cyclinder);

        btn_cyclinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Radius = editText_cyclinder.getText().toString();
                Double r= Double.parseDouble(Radius);
                double pi= 3.14;
                String Height=editText2_cyclinder.getText().toString();
                Double h=Double.parseDouble(Height);

                Double Volume =pi*r*r*h;
                text2_cyclinder.setText("Volume"+Volume+" m^3");
            }
        });

    }
}