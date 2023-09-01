package ru.geekbrains.lesson01.store3D.inmemory;

import ru.geekbrains.lesson01.store3D.models.Camera;
import ru.geekbrains.lesson01.store3D.models.Flash;
import ru.geekbrains.lesson01.store3D.models.PoligonalModel;
import ru.geekbrains.lesson01.store3D.models.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {
    private List<ModelChangedObserver> observers = new ArrayList<>();
    private List<PoligonalModel> models = new ArrayList<>();
    private List<Flash> flashes = new ArrayList<>();
    private List<Scene> scenes = new ArrayList<>();
    private List<Camera> cameras = new ArrayList<>();

    public void add(PoligonalModel modle) {
        models.add(modle);
        notifyChange();
    }

    @Override
    public void notifyChange() {
        for (ModelChangedObserver observer : observers) {
            observer.applyUpdateModel();
        }
    }

    @Override
    public void registerModelChanger(ModelChangedObserver o) {
        observers.add(o);
    }

    @Override
    public void removeModelChanger(ModelChangedObserver o) {
        observers.remove(o);
    }
}
