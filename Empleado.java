public class Empleado extends Persona {
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        super(nombre, edad);
        this.salario = salario;
    }

    public void mostrarSalario() {
        System.out.println("Mi salario es " + salario);
    }
}

