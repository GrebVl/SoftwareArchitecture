package ru.geekbrains.lesson05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class EditorDatabase implements Database{
    private Random random = new Random();
    private final ProjectFile projectFile;
    private Collection<Entity> entities;

    public EditorDatabase(ProjectFile projectFile) {
        this.projectFile = projectFile;
        load();
    }

    @Override
    public void load() {
        //TODO: Загрузка всех сущностей проекта
    }

    @Override
    public void save() {
        //TODO: Сохранение текущего состояния всех сущностей проекта

    }

    @Override
    public Collection<Entity> getAll() {
       if(entities == null){
           entities = new ArrayList<>();
           int entCount = random.nextInt(11);
           for(int i = 0; i < entCount; i++){
               genetateModelAndTextures();
           }
       }
       return entities;
    }

    private void genetateModelAndTextures(){
        Model3D model3D = new Model3D();
        int txCount = random.nextInt(3);
        for (int i = 0; i < txCount; i++){
            Texture texture = new Texture();
            model3D.getTextures().add(texture);
            entities.add(texture);
        }
        entities.add(model3D);
    }


}
