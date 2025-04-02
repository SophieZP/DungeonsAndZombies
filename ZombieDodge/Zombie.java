import greenfoot.*;

public class Zombie extends Actor {
    private boolean attracted = false;
    private int targetX, targetY;
    
    public Zombie(){
        //setImage("zombie.png"); // Añade la imagen correspondiente
    }
    
    public void act() {
        moveZombie();
        checkCollision();
    }
    
    public void setAttracted(boolean attracted, int x, int y) {
        this.attracted = attracted;
        targetX = x;
        targetY = y;
    }
    
    private void moveZombie() {
        int speed = 1;
        int dx = 0, dy = 0;
        if (attracted) {
            int diffX = targetX - getX();
            int diffY = targetY - getY();
            double angle = Math.atan2(diffY, diffX);
            dx = (int)(speed * Math.cos(angle));
            dy = (int)(speed * Math.sin(angle));
        } else {
            // Comportamiento normal: moverse hacia el primer personaje que encuentre
            Actor p = getWorld().getObjects(Personaje.class).stream().findFirst().orElse(null);
            if (p != null) {
                int diffX = p.getX() - getX();
                int diffY = p.getY() - getY();
                double angle = Math.atan2(diffY, diffX);
                dx = (int)(speed * Math.cos(angle));
                dy = (int)(speed * Math.sin(angle));
            }
        }
        setLocation(getX() + dx, getY() + dy);
    }
    
    private void checkCollision(){
        // Atacar a los personajes al colisionar
        Actor p = getOneIntersectingObject(Personaje.class);
        if (p != null) {
            ((Personaje)p).takeDamage(5);
        }
    }
}
