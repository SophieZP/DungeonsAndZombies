import greenfoot.*;

public class MenuInicio extends World {
    
    public MenuInicio() {    
        // Crear el mundo de 800x600 píxeles con 1 celda
        super(800, 600, 1); 
        
        prepare(); // Configuramos el menú de inicio
    }
    
    private void prepare() {
        // Mostrar un mensaje de bienvenida (puedes usar un GreenfootImage con texto)
        showText("Bienvenido a Zombie Dodge", getWidth() / 2, getHeight() / 4);
        showText("Haz click para continuar", getWidth() / 2, getHeight() / 2);
    }
    
    public void act() {
        // Cuando el jugador haga click en cualquier parte de la pantalla, avanzamos al menú de opciones
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new MenuOpciones());
        }
    }
}