/*Hacer un programa que dado un arreglo de enteros de tamaño 10
que se encuentra cargado, obtenga la cantidad de números pares
que tiene y la imprima. */

import java.util.Random;

public class CantidadNumerosPares{
    final static int MAX=10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;


public static void main(String[] args) {
    int [] arr= new int[MAX];
   int contador=0;
   cargar_arreglo_aleatorio_int(arr);
    for(int pos=0;pos<MAX;pos++){
    if(arr[pos]%2==0){
        contador+=1;
    }
}
imprimir_arreglo_int(arr);
System.out.println("El arreglo tiene: "+ contador+ " numeros pares");

}

//carga de arreglo de int con valores de MINVALOR a MAXVALOR
public static void cargar_arreglo_aleatorio_int(int [] arr){
    Random r = new Random();
    for (int pos = 0; pos < MAX; pos++){
    arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
    }
}

//impresion de arreglo de int
public static void imprimir_arreglo_int(int [] arr){
    for (int pos = 0; pos < MAX; pos++){
    System.out.println("nombre_arreglo["+pos+"]=>: "+arr[pos]);
    }
}
}