public class CuentaAhorrodesololectura {
    private double saldo;

    public CuentaAhorrodesololectura(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }
    // No hay setter -> el saldo nunca puede cambiar después de creado el objeto

    public static void main(String[] args) {
        CuentaAhorrodesololectura cuenta = new CuentaAhorrodesololectura(1500.0);
        System.out.println("Saldo: " + cuenta.getSaldo());
    }
}