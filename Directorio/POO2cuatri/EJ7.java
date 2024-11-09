package Directorio.POO2cuatri;

import java.util.Locale;

/**Crea una clase Utilidades con un método estático convertirAMayusculas que tome un String y devuelva el mismo String en mayúsculas. Llama a este método desde el método main sin crear una instancia de la clase.
*/
public class EJ7 {
  class Utilidades{
    public static String convertirAMayusculas(String texto){
      return texto.toUpperCase();
    }
  }

  public static void main(String[] args) {
    String resultado = Utilidades.convertirAMayusculas("puto el que lee");
    System.out.println(resultado);
  }
}
