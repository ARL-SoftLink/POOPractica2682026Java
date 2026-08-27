public class Principal2 {
     public static void main(String[] args) { 
        Empleado e = new Empleado("Carlos", 800.0); 
        System.out.println(e.nombre + " gana $" + e.getSalario()); 
        // e.salario = 5000;  <-- ERROR: salario es private 
    } 

}
