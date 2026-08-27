package Ejercicios.ejercicio10;

public class Torneo {
    // Arreglo privado de equipos (capacidad 4)
    private Equipo[] equipos = new Equipo[4];
    private int cantidad = 0;

    // Inscribe un equipo si hay cupo, devuelve true si se pudo
    public boolean inscribir(Equipo e) {
        if (cantidad < equipos.length) {
            equipos[cantidad] = e;
            cantidad++;
            return true;
        }
        return false;
    }

    // Muestra los equipos inscritos
    public void mostrarEquipos() {
        for (int i = 0; i < cantidad; i++) {
            System.out.println((i+1) + ". " + equipos[i].nombre);
        }
    }
}
