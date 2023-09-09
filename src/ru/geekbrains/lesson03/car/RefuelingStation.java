package ru.geekbrains.lesson03.car;

public class RefuelingStation implements Refueling{
    @Override
    public void fuel(FuelType fuelType) {
        switch (fuelType){
            case Disel:
                System.out.println("Заправка дизельным топливом");
                break;
            case Gasoline:
                System.out.println("Заправка бензиновым топливом");
                break;
        }
    }
}
