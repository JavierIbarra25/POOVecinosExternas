package Banco;

abstract public class CuentaBancaria {
    private String IBAN;
    private double saldo;
    private static int interesAnualBasico;

    public abstract void calcularIntereses();
    
    public CuentaBancaria(String IBAN, double saldo) {
        this.IBAN = IBAN;
        this.saldo = saldo;
    }

    public String getIBAN() {
        return IBAN;
    }

    public double getSaldo() {
        return saldo;
    }

    public void Ingresar (double cantidad) {
        this.saldo += cantidad;
    }

    public void Retirar (double cantidad) {
        this.saldo -= cantidad;
    }

    

}
