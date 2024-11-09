package Directorio.POO;

public class Ejercicio3 {
  private double saldo;
  String numeroCuenta;

  public Ejercicio3(double saldo, String numeroCuenta) {
    this.saldo = saldo;
    this.numeroCuenta = numeroCuenta;
  }
  public void depositar(double cantidad){
    saldo+= cantidad;
  }
  public void retirar(double cantidad){
    if(cantidad > saldo){
      System.out.println("ERROR saldo no disponible");
    }else{
      saldo-= cantidad;
    }
  }
  public void verSaldo(){
    System.out.println("Saldo: " + saldo);
  }

  public static void main(String[] args) {
    Ejercicio3 cuenta = new Ejercicio3(1000, "123456789");
    cuenta.depositar(500);
    cuenta.retirar(200);
    cuenta.verSaldo();
  }
}
