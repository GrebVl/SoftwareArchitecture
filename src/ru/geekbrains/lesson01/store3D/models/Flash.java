package ru.geekbrains.lesson01.store3D.models;

import java.awt.*;

public class Flash {
    private Point3D location;
    private Angle3D angle3D;
    private Color color;
    private Float power;

    public void rotate(Angle3D angle3D){
        this.angle3D = angle3D;
    }

    public void move(Point3D point3D){
        this.location = point3D;
    }

    public Point3D getLocation() {
        return location;
    }

    public Angle3D getAngle3D() {
        return angle3D;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Float getPower() {
        return power;
    }

    public void setPower(Float power) {
        this.power = power;
    }
}
