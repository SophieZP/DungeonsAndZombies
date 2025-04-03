import greenfoot.*;
public class Jugador1 extends Personaje {
    public void act() {
        mover();
        verificarInfeccion();
    }

    private void mover() {
        if (Greenfoot.isKeyDown("a")) setLocation(getX() - 4, getY());
        if (Greenfoot.isKeyDown("d")) setLocation(getX() + 4, getY());
        if (Greenfoot.isKeyDown("w")) setLocation(getX(), getY() - 4);
        if (Greenfoot.isKeyDown("s")) setLocation(getX(), getY() + 4);
    }

    protected void morir() {
        Greenfoot.stop();
    }
}