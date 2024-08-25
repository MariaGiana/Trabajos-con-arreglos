
/*Cargar un arreglo de tamaño ingresado por usuario, pidiendo el ingreso por teclado
de valores entre 1 y 12. Luego mostrar cómo quedó cargado. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CargarYMostrarArray {
    public static void main(String[] args) {
        int tamanio = cargarTamanioArreglo();
        int[] arreglo = new int[tamanio];
        cargarArreglo(arreglo, tamanio);
        mostrarArreglo(arreglo, tamanio);
    }

    public static int cargarTamanioArreglo() {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int tamanio = 0;
        boolean valido = false;

        while (!valido) {
            try {
                System.out.println("Ingrese el tamaño del array:");
                tamanio = Integer.valueOf(entrada.readLine());
                if (tamanio > 0) {
                    valido = true;
                } else {
                    System.out.println("El tamaño debe ser un número positivo.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
            }
        }
        return tamanio;
    }

    public static void cargarArreglo(int[] nuevoArreglo, int tamanio) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;

        while (num < tamanio) {
            boolean valido = false;
            while (!valido)
                try {
                    System.out.println("Ingrese un numero del 1 al 12:");
                    int valorIngresado = Integer.valueOf(entrada.readLine());
                    if (valorIngresado >= 1 && valorIngresado <= 12) {
                        nuevoArreglo[num] = valorIngresado;
                        valido = true;
                        num++;
                    } else
                        System.out.println("Por favor ingrese un numero valido");
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Por favor, ingrese un número.");
                } catch (Exception e) {
                    System.out.println("Ocurrió un error: " + e.getMessage());
                }
        }
    }

    public static void mostrarArreglo(int[] nuevoArreglo, int tamanio) {
        for (int num = 0; num < tamanio; num++)
            System.out.println("El arreglo en la posicion: " + num + " tiene el numero:" + nuevoArreglo[num]);

    }
}
