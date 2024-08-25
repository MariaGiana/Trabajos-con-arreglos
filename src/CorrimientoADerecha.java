/* Implementar un método que realice un corrimiento a derecha
en un arreglo ordenado de tamaño MAX=10 a partir de una
posición. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CorrimientoADerecha {
    final static int MAX=10;
    public static void main(String[] args) {
        int[]arr={3,6,3,2,5,9,66,4,3,80,23};
        int posicion=cargarPosicion(arr);
        int nuevoValor=ingresarNumero();
        imprimir_arreglo_int(arr);
      corrimientoDerecha(arr, posicion);
      arr[posicion]=nuevoValor;
     System.out.println("nuevo arreglo:");
      imprimir_arreglo_int(arr);
    }

    private static int ingresarNumero() {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numero=0;
        try {
            System.out.println("Ingresa el valor a incorporar:");
            numero = Integer.valueOf(entrada.readLine());
        } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
        }
        return numero;
    }
    

    public static int cargarPosicion(int[]arr) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int posicion = 0;
        boolean valido = false;

        while (!valido) {
            try {
                System.out.println("Ingrese una posicion dentro del array:");
                posicion = Integer.valueOf(entrada.readLine());
                if (posicion >= 0 && posicion < arr.length) {
                    valido = true;
                } else {
                    System.out.println("El numero debe ser un número positivo y menor al tamaño del arreglo.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
            }
        }
        return posicion;
    }

    
    public static void corrimientoDerecha(int [] arr, int pos){
    int i=MAX-1;
    while (i>pos) {
        arr[i]=arr[i-1];
        i--;
    }
    
    }
    //impresion de arreglo de int
    public static void imprimir_arreglo_int(int [] arr){
        for (int pos = 0; pos < MAX; pos++){
        System.out.print(arr[pos]+" || ");
        }
    }
    
}
