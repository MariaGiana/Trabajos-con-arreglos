//Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
//precargado, imprima por pantalla el promedio de sus valores.
import java.util.Random;

public class PromedioArrayPrecargado{

    final static int MAX=10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;

public static void main(String[] args) {
    int[]arr=new int[MAX];
    double promedio;
    cargar_arreglo_aleatorio_int(arr);
    promedio=promedio_arreglo(arr);
    System.out.println("El promedio del arreglo es: "+promedio);
}

private static double promedio_arreglo(int[] arr) {
   double suma=0;
   for(int pos=0;pos<MAX; pos++){
    suma=suma+arr[pos];
   }
   return ((double)suma/MAX);
}

public static void cargar_arreglo_aleatorio_int(int [] arr){
    Random r = new Random();
    for (int pos = 0; pos < MAX; pos++){
    arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
    System.out.println("arr["+pos+"] -> "+ arr[pos]);
    }
}

}

