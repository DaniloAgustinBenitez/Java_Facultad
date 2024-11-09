package Directorio.POO2cuatri;
/**Enunciado: Crea una clase Cliente con los atributos nombre y edad. Luego, crea una clase Pedido con el atributo numero y un atributo cliente de tipo Cliente. Implementa un método en Pedido para mostrar los datos del cliente y del pedido.*/
public class EJ9 {
  private class Cliente{
    private String nombre;
    private int edad;

    public Cliente(String nombre, int edad) {
      this.nombre = nombre;
      this.edad = edad;
    }
    public Object verAtributos(){
      return "nombre: "+nombre + " edad: "+ edad;
    }
  }
  class Pedido{
    int numero;
    Cliente Cliente;

    public Pedido(int numero, Cliente cliente) {
      this.numero = numero;
      this.Cliente = cliente;
    }
    public void Ticket(){
      System.out.println("Numero de pedido. "+numero+ " Cliente "+ Cliente.verAtributos());
    }
  } 

  public void main(String[] args) {
    Cliente cliente = new Cliente("Danilo", 22);
    Pedido pedido = new Pedido(3330, cliente);
    pedido.Ticket();
  }
}
