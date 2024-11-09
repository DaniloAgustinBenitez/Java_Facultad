package Directorio.Arreglos;

public class SumaSubArrays {
  public static void main(String[] args) {
    int[] Arraycoca ={1,2,3,4};
    int[] arraypepsi = new int[Arraycoca.length];
    int resguardo = 0;
    int n = Arraycoca.length;
    for(int i = 0; i < n;){
      if(i == 0){
        arraypepsi[i] = Arraycoca[i];
        resguardo = arraypepsi[i];
      }else{
        arraypepsi[i] = Arraycoca[i] + resguardo;
        resguardo = arraypepsi[i];
      }
      i++;
    }
    for (int i = 0; i < arraypepsi.length; i++){
      System.out.print(arraypepsi[i] + " ");
    }
  }
}
