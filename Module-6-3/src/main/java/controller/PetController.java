package controller;

import view.PetView;
import model.Pet;

public class PetController {

    private Pet pet = new Pet(150,150);
    private PetView gui;
    private double ToX;
    private double ToY;
    private boolean toChase = false;

    public PetController(PetView petView){
        this.gui = petView;
    }

    public double getPetX() {
        return pet.getX();
    }

    public double getPetY() {
        return pet.getY();
    }

    public void setTarget(double x, double y){
        ToX = x;
        ToY = y;
        toChase = true;
    }

    public void stopChasing(){
        toChase = false;
    }

    public void update(){
        if(toChase){
            boolean arrived = pet.move(ToX,ToY);
            if (arrived){
                toChase = false;
            }
        }
        gui.updateCanvas(pet.getX(),pet.getY());
    }
}
