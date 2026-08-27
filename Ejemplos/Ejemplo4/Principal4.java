public class Principal4 {
     public static void main(String[] args) { 
        Calculadora calc = new Calculadora(); 
        int[] datos = {5, -3, 8, -1, 2}; 
        System.out.println("Suma: " + calc.sumarPositivos(datos)); 
        // calc.esPositivo(4);  <-- ERROR: metodo private 
    } 

}
