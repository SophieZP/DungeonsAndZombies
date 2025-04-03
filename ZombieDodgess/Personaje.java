import greenfoot.*;

public abstract class Personaje extends Actor {
    protected int vida = 100;
    protected String estado = "Sano"; // "Sano", "Rasguño", "Laceración", "Mordedura"
    
    public void recibirDano(int cantidad) {
        vida -= cantidad;
        if (vida <= 0) {
            morir();
        }
    }
    
    public void curar(String tipo) {
        if (tipo.equals("vendas")) {
            vida += 20;
        } else if (tipo.equals("antidoto")) {
            if (estado.equals("Rasguño") || estado.equals("Laceración")) {
                estado = "Sano";
            }
        }
    }

    public void verificarInfeccion() {
        if (estado.equals("Rasguño") && Greenfoot.getRandomNumber(100) < 30) {
            convertirEnZombie();
        }
        if (estado.equals("Laceración") && Greenfoot.getRandomNumber(100) < 50) {
            convertirEnZombie();
        }
        if (estado.equals("Mordedura")) {
            convertirEnZombie();
        }
    }

    protected void convertirEnZombie() {
        getWorld().addObject(new Zombie(), getX(), getY());
        getWorld().removeObject(this);
    }

    protected abstract void morir();
}