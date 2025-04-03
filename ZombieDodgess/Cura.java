import greenfoot.*;

public class Cura extends Item {
    private String tipo;

    public Cura(String tipo) {
        this.tipo = tipo;
    }

    public void usar(Personaje p) {
        p.curar(tipo);
        getWorld().removeObject(this);
    }
}

