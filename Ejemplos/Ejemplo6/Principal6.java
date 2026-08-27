public class Principal6 {
     public static void main(String[] args) { 
        Gerente g = new Gerente(1000.0); 
        System.out.println("Total: " + g.calcularSalarioTotal()); 
        // System.out.println(g.salarioBase);  <-- ERROR fuera de la jerarquia 
    } 

}
