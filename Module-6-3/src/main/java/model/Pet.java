package model;

public class Pet {

    private double x;
    private double y;
    private double speed = 2;

    public Pet(double x, double y){
        this.x = x;
        this.y = y;
    }

    public boolean move(double ToX, double ToY){
        double distanceX = ToX - x;
        double distanceY = ToY -y;
        double distance = Math.sqrt(distanceX*distanceX + distanceY*distanceY);

        if (distance <= speed){
            x = ToX;
            y = ToY;
            return true;
        }

        x += distanceX / distance * speed;
        y += distanceY / distance * speed;
        return false;

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
