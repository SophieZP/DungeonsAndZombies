import greenfoot.*;

public class Arma extends Item {
    private int dano = 25;

    public void usar(Personaje p) {
        if (isTouching(Zombie.class)) {
            Zombie z = (Zombie) getOneIntersectingObject(Zombie.class);
            getWorld().removeObject(z);
        }
    }
}