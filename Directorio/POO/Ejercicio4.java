package Directorio.POO;

import java.util.ArrayList;

class Animales {
    public void hacerSonido(){
      System.out.println("Sonido de animal");
    }
}
  class perro extends Animales{
    @Override
    public void hacerSonido() {
      System.out.println("Guau");
    }
  }
  class gato extends Animales{
    @Override
    public void hacerSonido() {
      System.out.println("Miau");
    }
  }
  class serpiente extends Animales{
    @Override
    public void hacerSonido() {
      System.out.println("ssssss");
    }
  }
  class PolimorfismoDemo{
  public static void main(String[] args) {
    ArrayList<Animales> animal = new ArrayList<>();
    animal.add(new perro());
    animal.add(new gato());
    animal.add(new serpiente());
    for (Animales animalito : animal){
      animalito.hacerSonido();
    }
  }
}
