import greenfoot.*;

public class SeleccionModo extends World {
    private String modoSeleccionado;
    
    public SeleccionModo(String tipo) {    
        // Crear el mundo de 800x600 píxeles con 1 celda
        super(800, 600, 1); 
        modoSeleccionado = tipo;
        
        prepare(); // Configuramos el menú de selección de modo
    }
    
    private void prepare() {
        showText("Selecciona el modo de dificultad:", getWidth() / 2, getHeight() / 4);
        showText("1. Normal", getWidth() / 2, getHeight() / 2);
        showText("2. Hardcore", getWidth() / 2, getHeight() / 2 + 40);
    }
    
    public void act() {
        // Si el jugador hace click en cualquier lugar de la pantalla, pasamos al siguiente paso
        if (Greenfoot.mouseClicked(this)) {
            // Verificar si se hace click en una opción y pasar al mundo de juego
            if (Greenfoot.getMouseInfo().getY() > getHeight() / 2 && Greenfoot.getMouseInfo().getY() < getHeight() / 2 + 40) {
                Greenfoot.setWorld(new MyWorld(modoSeleccionado.equals("single") ? false : true));
            } else {
                Greenfoot.setWorld(new MyWorld(modoSeleccionado.equals("single") ? true : false));
            }
        }
    }
}