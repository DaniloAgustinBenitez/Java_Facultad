package Directorio.Arreglos;
public class FiltradoArray {
  public static void main(String[] args) {
    int[] arregloviejo ={1,0,2,0,3,0,4,0,5,0};
    int CantNewArray = 0;
    for(int i = 0;i < arregloviejo.length; i++){
      if(arregloviejo[i] > 0){
        CantNewArray++;
      }
    }
    int[] arreglonuevo = new int[CantNewArray];
    int j = 0;
    for(int i = 0;i < arregloviejo.length;i++){
      if (arregloviejo[i] > 0){
        arreglonuevo[j] = arregloviejo[i];
        j++;
      }
    }
    for (int i = 0; i< arreglonuevo.length;i++){
      System.out.print(arreglonuevo[i] + " ");
    }
  }
}

