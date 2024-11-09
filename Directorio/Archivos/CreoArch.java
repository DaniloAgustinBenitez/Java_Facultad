package Directorio.Archivos;
import java.io.* ;
public class CreoArch {
  public static void main(String[] args) {
    String nombreArchyruta = "C:\\Users\\danil\\TodoJava\\nuevo_directorio";
    File archivo = new File(nombreArchyruta);
    try {
      if(archivo.createNewFile()){
        System.out.println("Archivo creado exitosamente");
      }else{
        System.out.println("Errorr al crer el archivo");
      }
    }catch (IOException e ){
      System.out.println("Ocurrio un error al crear el archivo");
      e.printStackTrace();
    }

  }
}
