package Ejercicios.ejercicio6;

public class Principal {
     public static void main(String[] args) {
        Supervisor sup = new Supervisor(900);
        System.out.println("Sueldo total: " + sup.sueldoTotal());
        // sup.sueldoBase; // ERROR: no se puede acceder desde fuera de la jerarquía
    }
}
