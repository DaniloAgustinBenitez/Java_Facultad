package Directorio.Archivos;
import java.io.File;
import java.io.IOException;
public class CreacionArch {
    public static void main(String[] args) {
      String nombreArchivo = "Nuevo_Archivo.txt";
      String rutaDirectorio = "C:" + File.separator + "Users" + File.separator + "danil" + File.separator + "TodoJava" + File.separator + "nuevo_directorio";

      // Combina la ruta del directorio con el nombre del archivo
      String rutaCompleta = rutaDirectorio + File.separator + nombreArchivo;

      File archivo = new File(rutaCompleta);

      try {
        if (archivo.createNewFile()) {
          System.out.println("Archivo creado exitosamente");
        } else {
          System.out.println("Error al crear el archivo");
        }
      } catch (IOException e) {
        System.out.println("Ocurrió un error al crear el archivo");
        e.printStackTrace();
      }
    }
  }

