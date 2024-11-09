package Directorio.Archivos;

import java.io.File;
public class CrearDirectorio {
  public static void main(String[] args) {
    String directorioPath = "nuevo_directorio";
    //Ruta del directorio que creemos crear
    File directorio = new File(directorioPath);
    if(directorio.mkdir()){
      System.out.println("Directorio Creado exitosamente");
    }else{
      System.out.println("Error al crear un directorio");
    }
  }
}
