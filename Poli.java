package Directorio;
public class Poli {
    public static void main(String[] args) {
        FiguraGeometrica[] figuras = new FiguraGeometrica[] {new Circulo(), new Rectangulo(), new Circulo(), new Rectangulo()};
        for (FiguraGeometrica figura : figuras) {
            figura.dibujar();
        }
    }
}