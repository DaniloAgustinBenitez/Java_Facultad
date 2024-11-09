package Directorio.POO2cuatri;
public class EJ3 {
  private double saldo;
  String NumCuenta;

  public EJ3(double saldo, String numCuenta) {
    this.saldo = saldo;
    NumCuenta = numCuenta;
  }
  public void Depositar(double cantidad){
    saldo += cantidad;
  }
  public void retirar(double cantidad){
    if (saldo < cantidad) {
      System.out.println("ERROR SALDO INSUFICIENTE");
  }else {
      saldo -= cantidad;
    }
}
  public void versaldo(){
    System.out.println("Su saldo es de: "+saldo);
  }

  public static void main(String[] args) {
    EJ3 CuentaBancaria = new EJ3(800.0,"123456789");
    CuentaBancaria.Depositar(200);
    CuentaBancaria.retirar(900);
    CuentaBancaria.versaldo();
  }
}
