
public class Articulo {
    private int stock;

    public void setStock(int stock) {
        if (stock < 0) {
            System.out.println("Stock invalido");
        } else {
            this.stock = stock;
        }
    }

    public int getStock() {
        return stock;
    }

    public static void main(String[] args) {
        Articulo a = new Articulo();
        a.setStock(10);
        a.setStock(-3);
        System.out.println("Stock actual: " + a.getStock());
    }
}