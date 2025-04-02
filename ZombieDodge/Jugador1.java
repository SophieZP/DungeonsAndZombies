import greenfoot.*;

public class Jugador1 extends Personaje {
    public Jugador1(){
        //setImage("jugador1.png"); // Coloca la imagen de Jugador1 en tu proyecto
    }
    
    public void act() {
        super.act();
        checkKeys();
        checkCollisions();
    }
    
    private void checkKeys(){
        if (Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - 4);
        }
        if (Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + 4);
        }
        if (Greenfoot.isKeyDown("a")) {
            setLocation(getX() - 4, getY());
        }
        if (Greenfoot.isKeyDown("d")) {
            setLocation(getX() + 4, getY());
        }
    }
    
    private void checkCollisions(){
        // Verifica colisiones con ítems (cura o arma)
        Actor item = getOneIntersectingObject(Item.class);
        if (item != null) {
            if (item instanceof Cura) {
                ((Cura)item).applyHealing(this);
                getWorld().removeObject(item);
            } else if (item instanceof Arma) {
                // Implementa la recogida de arma según tu lógica
                getWorld().removeObject(item);
            }
        }
        
        // Colisión con zombies: se toma daño y se puede cambiar el estado
        Actor zombie = getOneIntersectingObject(Zombie.class);
        if (zombie != null) {
            takeDamage(10);
            estado = "Rasguño"; // Ejemplo: al chocar, se cambia a estado Rasguño
        }
    }
}