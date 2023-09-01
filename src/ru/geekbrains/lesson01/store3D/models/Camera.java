package ru.geekbrains.lesson01.store3D.models;

public class Camera {
    private Point3D location;
    private Angle3D angle3D;

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
}
