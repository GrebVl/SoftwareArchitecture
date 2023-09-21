package ru.geekbrains.lesson05;

import java.util.Collection;

public interface BusinessLogicalLayer {
    Collection<Model3D> getAllModels();
    Collection<Texture> getAllTextures();
    void renderModel(Model3D model);
    void renderAllModels();
    void removeModels(int id);
    void removeAllModels();

}
