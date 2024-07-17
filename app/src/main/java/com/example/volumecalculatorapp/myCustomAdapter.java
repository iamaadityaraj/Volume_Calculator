package com.example.volumecalculatorapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;


// for custom layout we create custom Adapter
// custom model class we use ArrayAdapter
public class myCustomAdapter extends ArrayAdapter<Shape> {


    // ArrayList is used becuase his feature of dynamically increase and decrease size
   private ArrayList<Shape>ShapeArrayList;

    // context provide acess to various services & resource that your app need to intreact with system
    Context context;


    // constructor of myCustomAdapter
    public myCustomAdapter(ArrayList<Shape> shapeArrayList, Context context1) {

        super(context1,R.layout.grid_item_layout,shapeArrayList);
        this.ShapeArrayList = shapeArrayList;
        this.context = context1;
    }


    // viewholder Static class is there to hold the behaivour of view
    private static class viewHolder{
        TextView ShapeName;
        ImageView ShapeImg;

    }

    @NonNull
    @Override



    //getview override to just know shape object current position
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Shape shapes = getItem(position);
        viewHolder holder=null;


        // if view is not available to just create a new view
        if(convertView== null){

            holder=new viewHolder();
            convertView= LayoutInflater.from(getContext()).inflate(
                    R.layout.grid_item_layout,
                    parent,
                    false
            );

            // finding views for grid_item_layout
            holder.ShapeName=(TextView) convertView.findViewById(R.id.shapeName);
            holder.ShapeImg=(ImageView) convertView.findViewById(R.id.shapeImg);

            convertView.setTag(holder);
        }

        // recycle or reused
        else {
            holder=(viewHolder) convertView.getTag();
            return convertView;

        }


        // getting data from model class
        holder.ShapeName.setText(shapes.getShapeName());
        holder.ShapeImg.setImageResource(shapes.getShapeImg());

        return convertView;
    }
}
