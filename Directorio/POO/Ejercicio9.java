package Directorio.POO;

public class Ejercicio9 {
  static class Cliente {
    String nombre;
    int edad;

    public Cliente(String nombre, int edad) {
      this.nombre = nombre;
      this.edad = edad;
    }

    public String verAtributos() {
      return "Nombre: " + nombre + ", Edad: " + edad;
    }
  }

  static class Pedido {
    int numero;
    Cliente cliente;

    public Pedido(int numero, Cliente cliente) {
      this.numero = numero;
      this.cliente = cliente;
    }

    public void verDetalles() {
      System.out.println("Pedido N°: " + numero);
      System.out.println("Cliente: " + cliente.verAtributos());
    }
  }
  public void main(String[] args) {
    Cliente cliente = new Cliente("Ana", 25);
    Pedido pedido = new Pedido(123, cliente);
    pedido.verDetalles();
  }
}
