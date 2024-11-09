package Directorio.Arreglos;

import java.util.Arrays;

public class ArreglosAgregar {
    public static void main(String[] args) {
        int[] arre = { 1, 2, 3, 4, 5 }; /* Agregamos un nuevo elemento */
        int nuevoElemento = 6;
        int tamañoN = arre.length + 1;
        int[] nuevoarre = Arrays.copyOf(arre, tamañoN);/*
                                                        * se crea un nuevo arr y se copia los datos del otro luego lo
                                                        * muestro por pantalla con un for
                                                        */
        nuevoarre[tamañoN - 1] = nuevoElemento;
        for (int i = 0; i < nuevoarre.length; i++) {
            System.out.print(nuevoarre[i] + " ");
        }

    }

}