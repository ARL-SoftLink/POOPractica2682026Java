public class Principal3 {
    public static void main(String[] args) { 
        Producto p = new Producto(10.0); 
        p.setPrecio(-5.0);          // intento invalido 
        p.setPrecio(15.0);          // valido 
        System.out.println("Precio final: " + p.getPrecio()); 
    } 

}
