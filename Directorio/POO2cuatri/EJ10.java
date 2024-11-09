package Directorio.POO2cuatri;
/**Enunciado: Crea una clase Vehiculo con un método mover. Luego, crea una clase Coche que herede de Vehiculo y sobrescriba el método mover. Implementa ambos métodos para que impriman un mensaje diferente.*/
class Vehiculo{
  public void mover(){
    System.out.println("El coche se mueve");
  }
}
public class EJ10 extends Vehiculo{
  @Override
  public void mover() {
    System.out.println("El vehiculo se mueveee");
  }

  public static void main(String[] args) {
    Vehiculo vehiculo = new Vehiculo();
    EJ10 coche = new EJ10();
    vehiculo.mover();
    coche.mover();
  }
}