package Directorio.POO2cuatri;
/**Enunciado: Crea una clase abstracta Figura con un método abstracto calcularArea. Luego, crea clases Circulo y Cuadrado que extiendan de Figura y proporcionen la implementación del método calcularArea.*/
public class EJ8 {
  abstract class figura{
    public abstract double calcularArea();
  }
  class circulo extends figura{
    private static double radio;

    public circulo(double radio) {
      this.radio = radio;
    }

    @Override
    public double calcularArea() {
      return Math.PI * radio * radio;
    }
  }
  class cuadrado extends figura{
    private static double lado;

    public cuadrado(double lado) {
      this.lado = lado;
    }

    @Override
    public double calcularArea() {
      return lado * lado;
    }
  }

  public void main(String[] args) {
    figura Circulo = new circulo(3);
    figura Cuadrado = new cuadrado(4);
    System.out.println("Area del ciculo: "+Circulo.calcularArea());
    System.out.println("Area del cuadrado: " +Cuadrado.calcularArea());
  }
}
