package Directorio.POO2cuatri;
/*Enunciado: Crea una clase Calculadora con métodos sumar sobrecargados para sumar dos, tres y cuatro números enteros.*/
public class EJ6 {
  class calculadora{
    public int sumar(int a, int b){
      return a + b;
    }
    public int sumar3nums(int a, int b, int c){
      return a + b + c;
    }
    public int sumar4nums(int a, int b, int c, int d){
      return a + b + c + d;
    }
    public int sumar5nums(int a, int b, int c, int d, int e){
      return a + b + c + d + e;
    }
  }
  public void main(String[] args) {
    calculadora Calculadora = new calculadora();
    System.out.println("Suma de dos numeros: "+ Calculadora.sumar(2, 4));
    System.out.println("Suma de tres numeros: " + Calculadora.sumar3nums(2, 4, 4));
    System.out.println("Suma de cuatro numeros: " + Calculadora.sumar4nums(2, 4, 4, 5));
    System.out.println("Suma de cinco numeros: " + Calculadora.sumar5nums(2, 4, 4, 5, 5));
  }
}
