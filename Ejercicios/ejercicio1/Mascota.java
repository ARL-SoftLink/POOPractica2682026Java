public class Mascota {
    public String nombre;
    public String tipo;

    public Mascota(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public static void main(String[] args) {
        Mascota m = new Mascota("Firulais", "Perro");
        // Como los atributos son public, accedemos directamente sin getters
        System.out.println("Nombre: " + m.nombre);
        System.out.println("Tipo: " + m.tipo);
    }
}