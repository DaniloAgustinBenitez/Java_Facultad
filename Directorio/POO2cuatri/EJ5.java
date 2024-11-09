package Directorio.POO2cuatri;
/*Enunciado: Crea una clase Rectangulo con los atributos ancho y alto. Proporciona un constructor que use la palabra clave this para diferenciar entre los atributos y los parámetros del constructor. Añade un método calcularArea que devuelva el área del rectángulo.*/
class rectangulo{
  int ancho;
  int alto;

  public rectangulo(int ancho, int alto) {
    this.ancho = ancho;
    this.alto = alto;
  }
  public int calcularArea(){
    return ancho*alto;
  }
}
public class EJ5 {
  public static void main(String[] args) {
    rectangulo Rectangulo = new rectangulo(5,6);
    Rectangulo.calcularArea();
    System.out.println("El area es de: "+Rectangulo.calcularArea());
  }
}