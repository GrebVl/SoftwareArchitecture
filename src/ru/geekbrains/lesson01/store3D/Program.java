package ru.geekbrains.lesson01.store3D;

import ru.geekbrains.lesson01.store3D.inmemory.ModelStore;
import ru.geekbrains.lesson01.store3D.inmemory.Observer1;
import ru.geekbrains.lesson01.store3D.models.Poligon;
import ru.geekbrains.lesson01.store3D.models.PoligonalModel;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Observer1 observer1 = new Observer1();

        ModelStore store = new ModelStore();
        store.registerModelChanger(observer1);

        Poligon poligon1 = new Poligon();
        List<Poligon> poligons = new ArrayList<>();
        poligons.add(poligon1);
        PoligonalModel poligonalModel = new PoligonalModel(poligons);
        store.add(poligonalModel);

    }
}
