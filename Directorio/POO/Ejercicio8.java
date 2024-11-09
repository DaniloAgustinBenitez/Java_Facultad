package Directorio.POO;

public class Ejercicio8 {
  abstract class Figura {
    public abstract double calcularArea();
  }
  class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
      this.radio = radio;
    }

    @Override
    public double calcularArea() {
      return Math.PI * radio * radio;
    }
  }

  class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
      this.lado = lado;
    }

    @Override
    public double calcularArea() {
      return lado * lado;
    }
    }
  public void main(String[] args) {
    Figura circulo = new Circulo(3);
    Figura cuadrado = new Cuadrado(4);

    System.out.println("Área del círculo: " + circulo.calcularArea());
    System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
  }
}
