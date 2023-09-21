package ru.geekbrains.lesson05;

public interface UILayer {
    void openProject(String fileName);
    void showProjectSettings();
    void saveProject();
    void printAllModels();
    void printAllTextures();
    void renderAll();
    void renderModel(int i);
    void removeModel(int id);
    void removeAllModel();
}
