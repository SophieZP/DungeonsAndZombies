import greenfoot.*;
import greenfoot.Actor;

public class Helicoptero extends Actor {
    public void act() {
        move(2);
        if (Greenfoot.getRandomNumber(1000) < 5) {
            aterrizar();
        }
    }

    private void aterrizar() {
        getWorld().addObject(new Cura("antidoto"), getX(), getY());
    }
}