package ru.geekbrains.lesson03.car;

public class CarService implements Fueling, CarCleaning{
    private Car car;

    CarService(Car car){
        this.car = car;
    }

    /**
     * Заправить автомобиль
     */
    @Override
    public void fuel() {
        if (car.getRefueling() != null){
            car.getRefueling().fuel(car.getFuelType());
        }
    }

    /**
     * Помыть автомобиль
     */

    @Override
    public void carWashing() {
        if(car.getCarWash() != null){
            car.getCarWash().carWashing(car.getCleaningType());
        }
    }

}
