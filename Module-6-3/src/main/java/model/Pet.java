package model;

import utils.Direction;

public class Pet {

    private int x;
    private int y;

    public Pet(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void move(Direction direction){
        switch (direction){
            //add cases here for how the cursor moves?
        }
        System.out.println("Pet is trying to catch at");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
