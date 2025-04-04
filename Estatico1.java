package  Static;
public class Estatico1 {
    public static void main(String[] args) {
        Persona p1 = new Persona("Tomás Navarra", 22);
        Persona p2 = new Persona("Jonás Estacio", 23);
        Persona p3 = new Persona("Juan Navarra", 22);
        Persona p4 = new Persona("Paco Estacio", 23);
        System.out.println("Se han creado: " + Persona.getContadorPersonas() + " personas");
    }
}