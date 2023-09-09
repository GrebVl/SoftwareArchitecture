package ru.geekbrains.lesson03.car;

public class CarWash implements Wiping {
    @Override
    public void carWashing(CleaningType cleaningType) {
        switch (cleaningType) {
            case Body:
                System.out.println("Очистка кузова");
                break;
            case Mirrors:
                System.out.println("Очистка Зеркал");
                break;
            case Headlights:
                System.out.println("Очистка фар");
                break;
            case Windshield:
                System.out.println("Очистка лобового стекла");
                break;
        }
    }
}
