package Ejercicios.ejercicio8;

public class Ticket {
    // Contador estático privado (compartido por todos los objetos)
    private static int contador = 0;
    // Número de ticket: final y privado
    private final int numero;

    public Ticket() {
        contador++;                // Incrementa el contador global
        this.numero = contador;    // Asigna el número actual
    }

    public int getNumero() {
        return numero;
    }
}
