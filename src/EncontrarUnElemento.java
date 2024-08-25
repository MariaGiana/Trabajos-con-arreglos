//Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra precargado, encuentre la posición de un
//número entero ingresado por el usuario. Si existe, muestre esa posición por pantalla, o indique que no existe.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class EncontrarUnElemento{
    public static int MAX=10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;


public static void main(String[] args) {
    int[] arr=new int [MAX];
    int pos=0;
    int numero;
    BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));

    try {
        cargar_arreglo_aleatorio_int(arr);
        System.out.println("Elija un numero entero: ");
        numero=Integer.valueOf(entrada.readLine());
        pos=obtener_posicion_arreglo(arr,numero,pos);
        imprimir_arreglo_int(arr);
        if(pos<MAX){
            System.out.println("El numero "+ numero + " existe y se encuentra en la posicion: "+pos);

        }else{
            System.out.println("El numero "+numero+" no está en el array!");
        }
        
    } catch (Exception e) {
        System.out.println("error");
    }
}


private static int obtener_posicion_arreglo(int[] arr, int numero, int pos) {
        int posicion=0; 
        while ((posicion<MAX)&&(arr[posicion]!=numero)){
        posicion++; 
        pos++;
        }
    return posicion;
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



/*ALTERNATIVA PARA EL MAIN Y LA FUNCION OBTENER POSICION ARREGLO:

public static void main(String[] args) {
        int[] arr = new int[MAX];
        int pos;
        int numero;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            cargar_arreglo_aleatorio_int(arr);
            imprimir_arreglo_int(arr);

            System.out.println("Elija un número entero: ");
            numero = Integer.valueOf(entrada.readLine());
            
            pos = obtener_posicion_arreglo(arr, numero);

            if (pos != -1) {
                System.out.println("El número " + numero + " existe y se encuentra en la posición: " + pos);
            } else {
                System.out.println("El número " + numero + " no está en el array!");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static int obtener_posicion_arreglo(int[] arr, int numero) {
        for (int i = 0; i < MAX; i++) {
            if (arr[i] == numero) {
                return i;
            }
        }
        return -1; // Devuelve -1 si el número no se encuentra en el arreglo
    } */