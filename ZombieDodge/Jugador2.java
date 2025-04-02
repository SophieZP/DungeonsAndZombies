import greenfoot.*;

public class Jugador2 extends Personaje {
    public Jugador2(){
        //setImage("jugador2.png"); // Coloca la imagen correspondiente
    }
    
    public void act() {
        super.act();
        checkKeys();
        checkCollisions();
    }
    
    private void checkKeys(){
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 4);
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 4);
        }
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - 4, getY());
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + 4, getY());
        }
    }
    
    private void checkCollisions(){
        Actor item = getOneIntersectingObject(Item.class);
        if (item != null) {
            if (item instanceof Cura) {
                ((Cura)item).applyHealing(this);
                getWorld().removeObject(item);
            } else if (item instanceof Arma) {
                // Lógica para recoger arma
                getWorld().removeObject(item);
            }
        }
        
        Actor zombie = getOneIntersectingObject(Zombie.class);
        if (zombie != null) {
            takeDamage(10);
            estado = "Rasguño";
        }
    }
}
