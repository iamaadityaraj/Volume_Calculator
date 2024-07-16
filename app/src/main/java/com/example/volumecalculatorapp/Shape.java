package com.example.volumecalculatorapp;

public class Shape {
    int ShapeImg;
    String ShapeName;

    public Shape(int shapeImg, String shapeName) {
        ShapeImg = shapeImg;
        ShapeName = shapeName;
    }

    public int getShapeImg() {
        return ShapeImg;
    }

    public void setShapeImg(int shapeImg) {
        ShapeImg = shapeImg;
    }

    public String getShapeName() {
        return ShapeName;
    }

    public void setShapeName(String shapeName) {
        ShapeName = shapeName;
    }
}
