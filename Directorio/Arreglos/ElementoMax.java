package Directorio.Arreglos;
import java.util.Scanner;
public class ElementoMax {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese la cantidad de elementos del arreglo");
    int n = sc.nextInt();
    int backUp = 0;
    int[] arrmax = new int[n];
    System.out.println("Ingrese los numeros a cargar");
    for(int i = 0; i < n; i++){
      arrmax[i] = sc.nextInt();
    }
    for(int j = 0; j < arrmax.length; j++){
      if(arrmax[j] > backUp){
        backUp = arrmax[j];
      }
    }
    System.out.println("El numero maximo es: "+ backUp);

  }
}
