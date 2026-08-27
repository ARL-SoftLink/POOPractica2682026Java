public class Principal {
    public static void main(String[] args) {
        Chip chip = new Chip();   // Válido porque ambas clases están en el mismo paquete
        chip.procesar();
    }
}
