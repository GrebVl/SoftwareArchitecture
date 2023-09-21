package ru.geekbrains.lesson05;

import java.util.Collection;
import java.util.Random;

public class EditorBusinessLogicalLayer implements BusinessLogicalLayer {

    private DatabaseAccess databaseAccess;

    public EditorBusinessLogicalLayer(DatabaseAccess databaseAccess) {
        this.databaseAccess = databaseAccess;
    }

    @Override
    public Collection<Model3D> getAllModels() {
        return databaseAccess.getAllModels();
    }

    @Override
    public Collection<Texture> getAllTextures() {
        return databaseAccess.getAllTextures();
    }

    @Override
    public void renderModel(Model3D model) {
        processRender(model);
    }

    @Override
    public void renderAllModels() {
        for(Model3D model: getAllModels()){
            processRender(model);
        }
    }

    @Override
    public void removeModels(int id) {
        for(Model3D model : getAllModels()){
            if(model.getId() == id){
                getAllModels().remove(model);
            }
        }
    }

    @Override
    public void removeAllModels() {
        for(Model3D model : getAllModels()){
            getAllModels().remove(model);
        }
    }

    private Random random = new Random();

    private void processRender(Model3D model) {
        try {
            Thread.sleep(2500 - random.nextInt(2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
