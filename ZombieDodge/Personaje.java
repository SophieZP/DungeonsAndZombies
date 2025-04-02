import greenfoot.*;

public class Personaje extends Actor {
    protected int health = 100;
    protected String estado = "Sano"; // Puede ser "Sano", "Rasguño", "Laceración", "Mordedura"
    
    public void act() {
        // Comportamiento común para todos los personajes
        checkInfection();
    }
    
    public void heal(int amount) {
        health += amount;
        if (health > 100) {
            health = 100;
        }
    }
    
    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            transformIntoZombie();
        }
    }
    
    public void checkInfection() {
        // Según el estado, se evalúa la probabilidad de transformarse en zombie
        if (estado.equals("Rasguño")) {
            if (Greenfoot.getRandomNumber(100) < 30) { // 30% de probabilidad
                transformIntoZombie();
            }
        } else if (estado.equals("Laceración")) {
            if (Greenfoot.getRandomNumber(100) < 50) { // 50% de probabilidad
                transformIntoZombie();
            }
        } else if (estado.equals("Mordedura")) {
            transformIntoZombie();
        }
    }
    
    public void transformIntoZombie() {
        World world = getWorld();
        if (world != null) {
            world.addObject(new Zombie(), getX(), getY());
            world.removeObject(this);
        }
    }
}