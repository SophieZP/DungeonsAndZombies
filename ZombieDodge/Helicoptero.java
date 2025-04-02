import greenfoot.*;

public class Helicoptero extends Actor {
    private Jugador1 jugador1;
    private Jugador2 jugador2;
    
    public Helicoptero(Jugador1 j1, Jugador2 j2) {
        this.jugador1 = j1;
        this.jugador2 = j2;
        //setImage("helicoptero.png"); // Asegúrate de tener la imagen en tu proyecto
    }
    
    public void act() {
        // Seguir la posición promedio de ambos jugadores
        int targetX = (jugador1.getX() + jugador2.getX()) / 2;
        int targetY = (jugador1.getY() + jugador2.getY()) / 2;
        moveTowards(targetX, targetY);
        
        // Atraer zombies: para cada zombie del mundo, indicamos que se mueva hacia el helicóptero
        MyWorld world = (MyWorld)getWorld();
        for (Object obj : world.getObjects(Zombie.class)) {
            Zombie z = (Zombie)obj;
            z.setAttracted(true, getX(), getY());
        }
    }
    
    private void moveTowards(int targetX, int targetY) {
        int dx = targetX - getX();
        int dy = targetY - getY();
        double angle = Math.atan2(dy, dx);
        int speed = 2;
        setLocation(getX() + (int)(speed * Math.cos(angle)), getY() + (int)(speed * Math.sin(angle)));
    }
}

