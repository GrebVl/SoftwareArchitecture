package ru.geekbrains.lesson01.store3D.models;

public class Scene {
    private int id;
    private PoligonalModel poligonalModel;
    private Flash flash;
    private Camera camera;

    public Scene(PoligonalModel poligonalModel, Camera camera) {
        this.poligonalModel = poligonalModel;
        this.camera = camera;
    }

    public PoligonalModel getPoligonalModel() {
        return poligonalModel;
    }

    public void setPoligonalModel(PoligonalModel poligonalModel) {
        this.poligonalModel = poligonalModel;
    }

    public Flash getFlash() {
        return flash;
    }

    public void setFlash(Flash flash) {
        this.flash = flash;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }
}
