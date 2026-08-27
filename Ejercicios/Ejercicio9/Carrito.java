public class Carrito {
private double[] precios = new double[5];
    private int cantidad;

    public void agregarPrecio(double precio) {
        if (cantidad < precios.length) {
            precios[cantidad] = precio;
            cantidad++;
        } else {
            System.out.println("El carrito está lleno.");
        }
    }

    public double calcularTotal() {
        double total = 0;

        for (int i = 0; i < cantidad; i++) {
            total += precios[i];
        }

        return total;
    }

    public static void main(String[] args) {
        Carrito carrito = new Carrito();

        carrito.agregarPrecio(10.0);
        carrito.agregarPrecio(5.5);
        carrito.agregarPrecio(2.25);

        System.out.println("Total: $" + carrito.calcularTotal());
    }
}
