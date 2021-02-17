package com.example.newapp;

public class Car {
    private  String id;
    private  String model;
    private  String color;
    private  double distane;

    public Car( String model, String color, double distane) {
        this.model = model;
        this.color = color;
        this.distane = distane;
    }

    public Car(String id, String model, String color, double distane) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.distane = distane;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDistane() {
        return distane;
    }

    public void setDistane(double distane) {
        this.distane = distane;
    }
}
