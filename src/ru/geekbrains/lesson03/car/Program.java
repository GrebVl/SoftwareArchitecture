package ru.geekbrains.lesson03.car;

import java.awt.*;

public class Program {
    public static void main(String[] args) {

        RefuelingStation refuelingStation = new RefuelingStation();
        CarWash carWash = new CarWash();


        Car[] cars = new Car[2];
        cars[0] = new Harvester("A", "B", Color.BLACK);
        cars[1] = new SportCar("C", "D", Color.GREEN);


        cars[0].setRefuelingStation(refuelingStation);
        cars[0].setCarWash(carWash);

        cars[1].setRefuelingStation(refuelingStation);
        cars[1].setCarWash(carWash);


        CarService carService0 = new CarService(cars[0]);
        CarService carService1 = new CarService(cars[1]);


        carService0.fuel();
        carService1.fuel();


        cars[0].setCleaningType(CleaningType.Body);
        cars[1].setCleaningType(CleaningType.Mirrors);


        carService0.carWashing();
        carService1.carWashing();


    }

    public static double calculateMaintenance(Car car){
        if (car.getWheelsCount() == 6){
            return 1500*6;
        }
        else {
            return 1000*4;
        }
    }
}
