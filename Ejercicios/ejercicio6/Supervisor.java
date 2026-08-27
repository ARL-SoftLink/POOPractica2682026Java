package Ejercicios.ejercicio6;

public class Supervisor extends Trabajador {
    // Constructor que pasa el sueldo al padre
    public Supervisor(double sueldoBase) {
        super(sueldoBase);
    }

    // Método que usa directamente el atributo protected de la superclase
    public double sueldoTotal() {
        return sueldoBase + 200;   // Acceso directo por herencia
    }
}