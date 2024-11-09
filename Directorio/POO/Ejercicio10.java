package Directorio.POO;

public class Ejercicio10 {
  class Vehiculo {
    public void mover() {
      System.out.println("El vehículo se está moviendo");
    }
  }

  class Coche extends Vehiculo {
    @Override
    public void mover() {
      System.out.println("El coche se está moviendo");
    }
  }
  public void main(String[] args) {
    Vehiculo vehiculo = new Vehiculo();
    Vehiculo coche = new Coche();

    vehiculo.mover();
    coche.mover();
  }
}
