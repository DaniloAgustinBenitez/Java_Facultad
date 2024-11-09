package Directorio.Arreglos;
public class InversionArreglos{
  public static void main(String[] args) {
    int[] arregloder ={1,2,3,4,5,6,7,8,9,10};
    int[] arregloizq = new int[arregloder.length];
    int n = arregloder.length - 1;
    for(int i = 0; i < arregloder.length; i++){
      arregloizq[i] = arregloder[n - i];
    }
    System.out.println("Arreglo normal");
    for (int i = 0; i < arregloder.length;i++) {
      System.out.print(arregloder[i] + " ");
    }
    System.out.println(" ");
    System.out.println("Arreglo Inverso");
    for (int i = 0; i < arregloizq.length;i++){
      System.out.print(arregloizq[i] + " ");
    }
  }
}





