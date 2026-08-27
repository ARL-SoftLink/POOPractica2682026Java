package Ejercicios.ejercicio7;

public class GestorConexion {
    // Única instancia (static)
    private static GestorConexion instancia;

    // Constructor private → no se puede usar 'new' desde fuera
    private GestorConexion() {
        System.out.println("Conexión creada");
    }

    // Método estático público que devuelve la misma instancia
    public static GestorConexion obtener() {
        if (instancia == null) {
            instancia = new GestorConexion();   // Primera llamada → crea
        }
        return instancia;
    }
}
