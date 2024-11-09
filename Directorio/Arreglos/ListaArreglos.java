package Directorio.Arreglos;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Scanner;
public class ListaArreglos {
  public static void menu(){
    System.out.println("==================================");
    System.out.println("Bienvenido al sistema ¿que desea hacer?");
    System.out.println("1. Añadir datos");
    System.out.println("2. Eliminar datos");
    System.out.println("3. Listar datos");
    System.out.println("4. Salir");
  }
  public static void eliminar(ArrayList<String> ListaProducto){
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el nombre del archivo que desee borrar");
    String nombre = sc.nextLine();
    for (int i = 0; i< ListaProducto.size();i++){
      if(nombre.equalsIgnoreCase(ListaProducto.get(i))){
        ListaProducto.remove(i);
        System.out.println("Producto eliminado");
        sc.nextLine();
        return;
      }else{
        System.out.println("No se encontro en la lista");
        sc.nextLine();
        return;
      }
    }
    sc.nextLine();
  }
  public static void nuevoelemento(ArrayList<String> ListaProducto){
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el nuevo elemento ");
    String nuevoP = sc.nextLine().trim();
    ListaProducto.add(nuevoP);
    System.out.println("Producto agregado correctamente");
    sc.nextLine();
  }
  public static void Listar(ArrayList<String> ListaProducto){
    System.out.println("Lista de todos los elementos de la lista");
    Scanner sc = new Scanner(System.in);
      for(String i : ListaProducto){
        System.out.println(i);
      }
    sc.nextLine();
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> ListaProducto = new ArrayList<>();
        ListaProducto.add("Leche");
        ListaProducto.add("Aceite");
        ListaProducto.add("Cebolla");
        ListaProducto.add("Pure");
        ListaProducto.add("Harina");
        ListaProducto.add("Pan");
        ListaProducto.add("Papa");
    menu();
    int rta = sc.nextInt();
    do {
      switch (rta){
        case 1:
          nuevoelemento(ListaProducto);
          break;
        case 2:
          eliminar(ListaProducto);
          break;
        case 3:
          Listar(ListaProducto);
          break;
        default:
          System.out.println("ERROR");
      }
      menu();
       rta = sc.nextInt();
    }while(rta  !=4);
  }
}

