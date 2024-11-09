package Directorio.POO2cuatri;

public class Ej1 {
  String marca;
  String modelo;
  int año;

    public Ej1(String marca, String modelo, int año) {
      this.marca = marca;
      this.modelo = modelo;
      this.año = año;
    }
    public void verAuto(){
      System.out.println("Marca: "+marca+" Modelo: "+modelo+" Año: "+año);
    }
  public static void main(String[] args) {
    Ej1 coche = new Ej1("Toyota","Corolla",2002);
    coche.verAuto();
    Ej1 coche2 = new Ej1("Mazda","RX7",2025);
    coche2.verAuto();
  }
}


