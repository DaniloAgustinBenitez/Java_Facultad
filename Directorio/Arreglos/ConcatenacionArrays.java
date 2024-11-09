package Directorio.Arreglos;

public class ConcatenacionArrays {
  public static void main(String[] args) {
    int[] arreA ={1, 2, 3};
    int[] arreB ={4, 5, 6};
    int[] arreC = new int[6];
    for(int i = 0; i < 6; i++){
      if(i < 3){
        arreC[i] = arreA[i];
      }else{
        arreC[i] = arreB[i - 3];
      }
    }
    for (int j : arreC) {
      System.out.print(j + " ");
    }
  }
}
