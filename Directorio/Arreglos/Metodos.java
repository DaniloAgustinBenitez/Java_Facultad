package Directorio.Arreglos;

import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero:");
        int a = sc.nextInt();
        System.out.print("Ingrese otro numero:");
        int b = sc.nextInt();
        int valor = lasuma(a, b);
        System.out.println("Resultado:" + valor);
        sc.close();
    }

    public static int lasuma(int a, int b) {
        int resultado = a + b;
        return resultado;
    }
}
