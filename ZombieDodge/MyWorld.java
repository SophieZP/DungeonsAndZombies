import greenfoot.*;

public class MyWorld extends World {
    private boolean hardcoreMode;
    private int numPlayers;
    private Jugador1 jugador1;
    private Jugador2 jugador2;
    
    // Constructor modificado para recibir el número de jugadores y la dificultad.
    public MyWorld(int numPlayers, boolean hardcoreMode) {    
        super(1200, 800, 1, false); // Mundo amplio sin cuadrícula.
        this.numPlayers = numPlayers;
        this.hardcoreMode = hardcoreMode;
        //setBackground("background.jpg");  // Asegúrate de tener esta imagen en el proyecto
        
        // Crear jugadores según la elección del menú.
        if(numPlayers == 1) {
            jugador1 = new Jugador1();
            addObject(jugador1, 200, 400);
        } else if(numPlayers == 2) {
            jugador1 = new Jugador1();
            jugador2 = new Jugador2();
            addObject(jugador1, 200, 400);
            addObject(jugador2, 1000, 400);
        }
        
        // Agregar zombies e ítems según el modo seleccionado.
        if(hardcoreMode) {
            // Modo Hardcore: más zombies y menos curación.
            for (int i = 0; i < 10; i++){
                addObject(new Zombie(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
            }
            for (int i = 0; i < 3; i++){
                addObject(new Cura(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
            }
        } else {
            // Modo Normal: menos zombies y más objetos de curación.
            for (int i = 0; i < 5; i++){
                addObject(new Zombie(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
            }
            for (int i = 0; i < 6; i++){
                addObject(new Cura(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
            }
        }
        
        // Agregar armas y otros ítems.
        for (int i = 0; i < 4; i++){
            addObject(new Arma(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        }
        
        // Evento especial: Helicóptero aparece con un 10% de probabilidad.
        if (Greenfoot.getRandomNumber(100) < 10) {
            Helicoptero helicoptero = new Helicoptero(jugador1, jugador2);
            addObject(helicoptero, getWidth() / 2, 50);
        }
    }
    
    public void act(){
        // Aquí podrías agregar la lógica para la "cámara" que siga a los jugadores.
    }
}

