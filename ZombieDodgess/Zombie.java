import greenfoot.*;

public class Zombie extends Actor {
    public void act() {
        seguirJugador();
    }

    private void seguirJugador() {
        World mundo = getWorld();
        Jugador1 j1 = (Jugador1) mundo.getObjects(Jugador1.class).get(0);
        Jugador2 j2 = (Jugador2) mundo.getObjects(Jugador2.class).get(0);
        
        Personaje objetivo = (Greenfoot.getRandomNumber(2) == 0) ? j1 : j2;
        turnTowards(objetivo.getX(), objetivo.getY());
        move(2);
    }
}