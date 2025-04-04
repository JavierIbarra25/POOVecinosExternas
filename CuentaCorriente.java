package Banco;

public class CuentaCorriente extends CuentaBancaria {

    public CuentaCorriente(String IBAN, double saldo) {
        super(IBAN, saldo);
    }

    public String toString() {
        return ("Cuenta Corriente [IBAN: " + this.getIBAN() + " Saldo: " + this.getSaldo() + "]");
    }

    public void calcularIntereses(){
        double intereses = getSaldo() * 0.02;
    } 
}
