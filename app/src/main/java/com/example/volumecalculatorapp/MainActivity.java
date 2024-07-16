package com.example.volumecalculatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList<Shape>  shapeArrayList;
    private static myCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        gridView=findViewById(R.id.gridView);
        shapeArrayList = new ArrayList<>();
        Shape s1= new Shape(R.drawable.sphere,"Sphere");
        Shape s2=new Shape(R.drawable.cube,"Cube");
        Shape s3= new Shape(R.drawable.cylinder,"Cyclinder");
        Shape s4= new Shape(R.drawable.prism,"Prism");


        shapeArrayList.add(s1);
        shapeArrayList.add(s2);
        shapeArrayList.add(s3);
        shapeArrayList.add(s4);

        adapter=new myCustomAdapter(shapeArrayList,getApplicationContext());
        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String n = ((myCustomAdapter) adapterView.getAdapter()).getItem(i).ShapeName;
                System.out.println(n);
                if (n == "Sphere") {
                    Intent intent = new Intent(getApplicationContext(), Sphere_Activity.class);
                    startActivity(intent);
                } else if (n == "Cyclinder") {
                    Intent intent = new Intent(getApplicationContext(), cyclinder_Activity.class);
                    startActivity(intent);
                } else if (n== "Cube") {
                    Intent intent=new Intent(getApplicationContext(), Cube_Activity.class);
                    startActivity(intent);
                } else if (n=="Prism") {
                    Intent intent= new Intent(getApplicationContext(), prism_activity.class);
                    startActivity(intent);
                }
            }
        });

    }

}