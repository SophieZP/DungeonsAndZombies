import greenfoot.*; 
public class Jugador2 extends Personaje {
    public void act() {
        mover();
        verificarInfeccion();
    }

    private void mover() {
        if (Greenfoot.isKeyDown("left")) setLocation(getX() - 4, getY());
        if (Greenfoot.isKeyDown("right")) setLocation(getX() + 4, getY());
        if (Greenfoot.isKeyDown("up")) setLocation(getX(), getY() - 4);
        if (Greenfoot.isKeyDown("down")) setLocation(getX(), getY() + 4);
    }

    protected void morir() {
        Greenfoot.stop();
    }
}
