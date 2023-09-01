package ru.geekbrains.lesson01.store3D.inmemory;

public class Observer2 implements ModelChangedObserver{

    @Override
    public void applyUpdateModel() {
        System.out.println("Была добавлена новая полигональная модель - observer$1");

    }
}
