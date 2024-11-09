package Directorio.POO;

public class Ejercicio6 {
  static class Calculadora{
    public int sumar(int a, int b){
      return a + b;
    }

    public int sumar(int a, int b, int c) {
      return a + b + c;
    }

    public int sumar(int a, int b, int c, int d) {
      return a + b + c + d;
    }
  }
  public void main(String[] args) {
    Calculadora calculadora = new Calculadora();
    System.out.println("Suma de 2 números: " + calculadora.sumar(1, 2));
    System.out.println("Suma de 3 números: " + calculadora.sumar(1, 2, 3));
    System.out.println("Suma de 4 números: " + calculadora.sumar(1, 2, 3, 4));
  }
}





