package Directorio.Arreglos;

import java.util.Scanner;

public class ArregloModificacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); /* voy a pedir un numero y colocarlo ordenandamente */
        System.out.println("Ingrese el numero que desea cargar (modificando el numero menor a ese)");
        int Nro = sc.nextInt();
        int[] arreglo = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        for (int i = 0; i < arreglo.length; i++) {
            if (Nro < arreglo[i]) {
                arreglo[i - 1] = Nro;
                break;
            }
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        sc.close();
    }
}
