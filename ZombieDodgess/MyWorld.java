import greenfoot.*;

public class MyWorld extends World {
    private boolean hardcoreMode;
    
    public MyWorld(boolean hardcoreMode) {    
        super(800, 600, 1, false); // Mundo sin scroll automático
        this.hardcoreMode = hardcoreMode;  // Almacena el modo de dificultad
        
        setBackground("mundo.jpg");  // Establece el fondo del mundo
        
        prepararEscenario();  // Configura los objetos iniciales en el mundo
    }
    
    private void prepararEscenario() {
        // Crear los objetos iniciales (jugadores, zombies, armas, etc.)
        Jugador1 jugador1 = new Jugador1();
        Jugador2 jugador2 = new Jugador2();
        
        addObject(jugador1, 200, 300); // Ubicación de Jugador 1
        addObject(jugador2, 600, 300); // Ubicación de Jugador 2
        
        // Si estamos en modo hardcore, agregar más enemigos o ajustar la dificultad
        if (hardcoreMode) {
            // Crear más zombies, menos objetos de curación, etc.
            for (int i = 0; i < 10; i++) {
                addObject(new Zombie(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
            }
        } else {
            // Si no es modo hardcore, agregar menos zombies y más objetos de curación
            for (int i = 0; i < 5; i++) {
                addObject(new Zombie(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
            }
            // Agregar objetos de curación, por ejemplo
            //addObject(Cura(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
        }
    }
    
    public void act() {
        // Aquí va la lógica del juego: movimiento de jugadores, creación de enemigos, etc.
        // Este método se ejecuta continuamente durante el juego.
        
        // Lógica para zombies, control de los jugadores, objetos, etc.
    }
}