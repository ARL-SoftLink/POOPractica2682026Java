package Ejercicios.ejercicio7;

public class Principal {
    public static void main(String[] args) {
        GestorConexion g1 = GestorConexion.obtener();
        GestorConexion g2 = GestorConexion.obtener();
        // Comparación de referencias (mismo objeto)
        System.out.println("Son la misma conexion: " + (g1 == g2));
    }
}
