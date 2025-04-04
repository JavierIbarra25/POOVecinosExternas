package Banco;

public class Main {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente("ES6256465847", 1000);
        CuentaAhorro ca = new CuentaAhorro("ES9956415656", 3000);

        System.out.println("Datos de las cuentas:");
        System.out.println(cc.toString());
        System.out.println(ca.toString());

        System.out.println("Ingresamos, retiramos y mostramos el saldo de las cuentas:");
}
}
