package Directorio.POO2cuatri;
/*Enunciado: Crea una clase Persona con los atributos nombre y edad. Luego, crea una clase Empleado que herede de Persona y añada el atributo sueldo. Implementa el método verAtributos en ambas clases.*/
public class EJ2 {
  String nombre;
  int edad;

  public EJ2(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }
  public void verpersona(){
    System.out.print("Nombre: "+nombre + " Edad: "+edad);
  }

}
class empleado extends EJ2{
  double sueldo;

  public empleado(String nombre, int edad, double sueldo) {
    super(nombre, edad);
    this.sueldo = sueldo;
  }
public void verpersona(){
    super.verpersona();
    System.out.println(" Sueldo: "+sueldo);
  }
  public static void main(String[] args) {
    empleado Empleado = new empleado("Marcelo",24,300.0);
    Empleado.verpersona();
    empleado Empleado2 = new empleado("Danilo",22,1300.0);
    Empleado2.verpersona();
  }
}