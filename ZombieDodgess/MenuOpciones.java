import greenfoot.*;

public class MenuOpciones extends World {
    
    public MenuOpciones() {    
        // Crear el mundo de 800x600 píxeles con 1 celda
        super(800, 600, 1); 
        
        prepare(); // Configuramos el menú de opciones
    }
    
    private void prepare() {
        // Mostrar opciones de selección
        showText("Selecciona el modo de juego:", getWidth() / 2, getHeight() / 4);
        showText("1. Single Player", getWidth() / 2, getHeight() / 2);
        showText("2. Two Player", getWidth() / 2, getHeight() / 2 + 40);
    }
    
    public void act() {
        // Si el jugador hace click en cualquier lugar de la pantalla, pasamos a la siguiente opción
        if (Greenfoot.mouseClicked(this)) {
            // Aquí se verifica si se hace click en la opción 1 o 2 y pasamos al siguiente paso
            // Por ejemplo, si el jugador hace click, detectamos si la posición del click es adecuada
            if (Greenfoot.getMouseInfo().getY() > getHeight() / 2 && Greenfoot.getMouseInfo().getY() < getHeight() / 2 + 40) {
                Greenfoot.setWorld(new SeleccionModo("single"));
            } else {
                Greenfoot.setWorld(new SeleccionModo("two"));
            }
        }
    }
}
