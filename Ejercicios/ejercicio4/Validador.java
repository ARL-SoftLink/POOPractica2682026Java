package Ejercicios.ejercicio4;

public class Validador {

    private boolean esPar(int n) {
        return n % 2 == 0;
    }

    public int contarPares(int[] numeros) {
        int contador = 0;
        for (int num : numeros) {
            if (esPar(num)) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Validador v = new Validador();
        int[] numeros = {2, 5, 8, 11, 4};
        System.out.println("Pares encontrados: " + v.contarPares(numeros));
    }
}
