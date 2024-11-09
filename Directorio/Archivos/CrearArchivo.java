package Directorio.Archivos;

import java.io.File;
import java.io.IOException;
public class CrearArchivo {
  public static void main(String[] args) {
    String archivoPath = "Nuevo_Archivo.txt";
    String ruta = "C:\\Users\\danil\\TodoJava\\nuevo_directorio";
    String rutacompleta = archivoPath + ruta;
    File archivo = new File(rutacompleta);
    try{
      if(archivo.createNewFile()){
        System.out.println("Archivo creado exitosamente");
      }else{
        System.out.println("Error al crear el archivo");
      }
    }catch(IOException e){
      System.out.println("Ocurrio un error al crear el archivo");
      e.printStackTrace();
    }
  }
}
