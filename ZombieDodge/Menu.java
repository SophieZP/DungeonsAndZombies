import greenfoot.*;

public class Menu extends World {
    // Variables para almacenar las elecciones del usuario.
    private int numPlayers = 0; // 1 o 2
    private boolean hardcoreMode = false;
    // Paso 0: selección de jugadores; Paso 1: selección de dificultad.
    private int menuStep = 0; 

    public Menu() {    
        super(800, 600, 1);
        showMenu();
    }
    
    public void act() {
        if(menuStep == 0) {
            // Selección de número de jugadores: presiona 1 o 2.
            if(Greenfoot.isKeyDown("1")) {
                numPlayers = 1;
                menuStep = 1;
                Greenfoot.delay(10);
                showMenu();
            } else if(Greenfoot.isKeyDown("2")) {
                numPlayers = 2;
                menuStep = 1;
                Greenfoot.delay(10);
                showMenu();
            }
        } else if(menuStep == 1) {
            // Selección de dificultad: presiona 1 para Normal, 2 para Hardcore.
            if(Greenfoot.isKeyDown("1")) {
                hardcoreMode = false;
                startGame();
            } else if(Greenfoot.isKeyDown("2")) {
                hardcoreMode = true;
                startGame();
            }
        }
    }
    
    private void showMenu() {
        if(menuStep == 0) {
            showText("Seleccione modo de jugadores:\nPresiona 1 para 1 jugador, 2 para 2 jugadores", 
                     getWidth()/2, getHeight()/2);
        } else if(menuStep == 1) {
            showText("Seleccione dificultad:\nPresiona 1 para Normal, 2 para Hardcore", 
                     getWidth()/2, getHeight()/2);
        }
    }
    
    private void startGame() {
        // Limpiar la pantalla del menú.
        showText("", getWidth()/2, getHeight()/2);
        // Mostrar cinemática antes de iniciar el juego.
        showCinematic();
        // Iniciar el mundo del juego con los parámetros elegidos.
        Greenfoot.setWorld(new MyWorld(numPlayers, hardcoreMode));
    }
    
    private void showCinematic() {
        // Mostrar mensaje de cinemática durante un tiempo determinado.
        showText("Y asi fue como el fin del mundo llego\nEsta es la historia de como moriste", 
                 getWidth()/2, getHeight()/2);
        Greenfoot.delay(150);
        showText("", getWidth()/2, getHeight()/2);
    }
}

