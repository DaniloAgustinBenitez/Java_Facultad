package Directorio.POO;

public class Ejercicio7 {
  class Utilidades {
    public static String convertirAMayusculas(String texto) {
      return texto.toUpperCase();
    }
  }
  public static void main(String[] args) {
    String resultado = Utilidades.convertirAMayusculas("hola mundo");
    System.out.println(resultado);
  }
}
