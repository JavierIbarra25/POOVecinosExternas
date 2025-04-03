public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 30);
        persona.saludar();  // Esto funcionará correctamente

        Empleado empleado = new Empleado("Juan", 30, 50000);
        empleado.saludar();
        empleado.mostrarSalario();
    }
}

