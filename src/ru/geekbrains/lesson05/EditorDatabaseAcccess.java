package ru.geekbrains.lesson05;

import java.util.ArrayList;
import java.util.Collection;

public class EditorDatabaseAcccess implements DatabaseAccess{
    private final Database editorDatabase;

    public EditorDatabaseAcccess(Database editorDatabase) {
        this.editorDatabase = editorDatabase;
    }

    @Override
    public void addEntity(Entity entity) {
        editorDatabase.getAll().add(entity);
    }

    @Override
    public void removeEntity(Entity entity) {
        editorDatabase.getAll().remove(entity);
    }

    @Override
    public Collection<Texture> getAllTextures() {
        Collection<Texture> models = new ArrayList<>();
        for(Entity entity: editorDatabase.getAll()){
            if(entity instanceof Model3D){
                models.add((Texture) entity);
            }
        }
        return models;
    }

    @Override
    public Collection<Model3D> getAllModels() {
        Collection<Model3D> models = new ArrayList<>();
        for(Entity entity: editorDatabase.getAll()){
            if(entity instanceof Model3D){
                models.add((Model3D)entity);
            }
        }
        return models;
    }
}
