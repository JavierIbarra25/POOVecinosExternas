package Static;

public class Persona {
    private String nombre;
    private int edad;
    private static int contadorPersonas = 0;  // Inicializado aquí

    public Persona() {
        contadorPersonas++;  
    }

    public Persona(String nombre, int edad) {
        contadorPersonas++;
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y setters compactos
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public static int getContadorPersonas() { return contadorPersonas; }
}