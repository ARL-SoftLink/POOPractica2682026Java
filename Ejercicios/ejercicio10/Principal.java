package Ejercicios.ejercicio10;

public class Principal {
    public static void main(String[] args) {
        Torneo t = new Torneo();
        // Intentamos inscribir 5 equipos (solo caben 4)
        boolean r1 = t.inscribir(new Equipo("Real Madrid"));
        boolean r2 = t.inscribir(new Equipo("Barcelona"));
        boolean r3 = t.inscribir(new Equipo("Atlético"));
        boolean r4 = t.inscribir(new Equipo("Sevilla"));
        boolean r5 = t.inscribir(new Equipo("Valencia"));

        System.out.println("Inscripción 1: " + r1);
        System.out.println("Inscripción 2: " + r2);
        System.out.println("Inscripción 3: " + r3);
        System.out.println("Inscripción 4: " + r4);
        System.out.println("Inscripción 5: " + r5); // false (cupo lleno)
        t.mostrarEquipos();
    }
}
