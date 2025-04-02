import greenfoot.*;

public class Cura extends Item {
    public Cura() {
        // Establecer imagen para el objeto de curación
        //setImage("cura.png"); // Asegúrate de tener la imagen en el proyecto
    }
    
    public void act(){
        // Comportamiento particular del objeto de curación (si es necesario)
    }
    
    public void applyHealing(Personaje p) {
        // Recupera la salud del personaje
        p.heal(20); // Valor de curación arbitrario; ajústalo a lo que necesites
    }
}
