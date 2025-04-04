package Banco;

public class CuentaAhorro extends CuentaBancaria {

    public CuentaAhorro(String IBAN, double saldo) {
        super(IBAN, saldo);
    }

    public String toString() {
        return ("Cuenta Corriente [IBAN: " + this.getIBAN() + " Saldo: " + this.getSaldo() + "]");
    }

    public void calcularIntereses(){
        double intereses = getSaldo() * 0.02;
    } 
}
