package ru.geekbrains.lesson03.car;

import java.awt.*;

public class Harvester extends Car{


    public Harvester(String make, String model, Color color) {
        super(make, model, color);
        fuelType = FuelType.Disel;
        setWheelsCount(6);
    }


    @Override
    public void movement() {

    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public void switchHeadLights() {

    }

    @Override
    public boolean switchHeadlights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }

    public void sweeping() {
        System.out.println("Автомобиль метет улицу.");
    }

}
