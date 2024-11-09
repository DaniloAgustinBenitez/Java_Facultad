package Directorio.POO2cuatri;

import java.util.ArrayList;

/*Enunciado: Crea una clase base Animal con un método hacerSonido. Luego, crea clases derivadas Perro y Gato que sobrescriban el método hacerSonido. En el método principal, crea una lista de Animal que contenga objetos de tipo Perro y Gato, y llama al método hacerSonido para cada uno.*/
class animales{
  public void hacersonido() {
    System.out.println("Sonido de animal");
  }
}
class perro extends animales{
  @Override
  public void hacersonido() {
    System.out.println("Guau Guau");
  }
}
class gato extends animales{
  public void hacersonido(){
    System.out.println("moka chan vo ichicorita");
  }
}
public class EJ4{
  public static void main(String[] args) {
    ArrayList<animales>Animales = new ArrayList<>();
    Animales.add(new perro());
    Animales.add(new gato());
    for (animales animal : Animales){
      animal.hacersonido();
    }
  }
}