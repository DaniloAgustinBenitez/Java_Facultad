package Directorio.POO;

public class Ejercicio5 {
  static class Rectangulo{
    int ancho;
    int alto;

    public Rectangulo(int ancho, int alto) {
      this.ancho = ancho;
      this.alto = alto;
    }
    public int calcularArea(){
      return ancho * alto;
    }
  }
  public void main(String[] args) {
    Rectangulo rectangulo = new Rectangulo( 5,3);
    System.out.println("Area: " + rectangulo.calcularArea());
  }
}
