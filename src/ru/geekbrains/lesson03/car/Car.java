package ru.geekbrains.lesson03.car;

import java.awt.*;

public abstract class Car{

    //region Constructors

    public Car(String make, String model, Color color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }


    //endregion

    //region Public Methods

    // Движение
    public abstract void movement();

    // Обслуживание
    public abstract void maintenance();

    // Переключение передач
    public abstract boolean gearShifting();

    // Фключение фар
    public abstract void switchHeadLights();

    public abstract boolean switchHeadlights();

    // Фключение дворников
    public abstract boolean switchWipers();

    public boolean switchFogLights(){
        fogLights = !fogLights;
        return fogLights;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public CleaningType getCleaningType() {
        return cleaningType;
    }

    protected void setWheelsCount(int wheelsCount){
        this.wheelsCount = wheelsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setCleaningType(CleaningType cleaningType) {
        this.cleaningType = cleaningType;
    }

    public Refueling getRefueling() {
        return refueling;
    }

    public Wiping getCarWash() {
        return washing;
    }

    public void setRefuelingStation(Refueling refuelingStation) {
        this.refueling = refuelingStation;
    }

    public void setCarWash(Wiping washing) {
        this.washing = washing;
    }

    //endregion

    //region Private Fields

    // Марка автомобиля
    private String make;

    // Модель
    private String model;

    // Цвет
    private Color color;

    // Тип
    private CarType type;

    // Число колес
    private int wheelsCount;

    //Тип топлива
    protected FuelType fuelType;

    // Тип коробки передач
    private GearboxType gearboxType;

    // Объем двигателя
    private double engineCapacity;

    //Состояние противотуманных фар
    private boolean fogLights = false;

    //Загрезнение атомобиля
    protected CleaningType cleaningType;

    private Refueling refueling;
    private Wiping washing;

    //endregion

}
