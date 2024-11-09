package Directorio.POO;
public class Ejercicio1Too {
  public static void main(String[] args) {
    Ejercicio1 coche1 = new Ejercicio1("Toyota",1998, "AE86");
    Ejercicio1 coche2 = new Ejercicio1("Ford", 1992, "Mustang");
    System.out.println("coche 1");
    System.out.println("Marca:" + coche1.getMarca());
    System.out.println("modelo: "+ coche1.getModelo());
    System.out.println("Año:"+ coche1.getAnio());
  }
}
