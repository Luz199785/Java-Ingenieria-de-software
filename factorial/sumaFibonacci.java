/* Calcule la suma de los términos de la serie FIBONACCI cuyos valores 
se encuentran 
entre 100 y 10,000.*/




package factorial;
import java.util.Scanner;
 
public class sumaFibonacci {
    public static void main(String[] args) {
        
        
    int numero=1;
    int suma=1;
    int aux;
    int sumaValores=0;
        for (int i = 1; i <= 100; i++) {
            System.out.println(numero);
            if(numero>=100 && numero <=10000){
            sumaValores=sumaValores+numero;
        }
            aux=numero;
            numero=suma;
            suma=numero+aux;
            
        }
        System.out.println("La suma de los valores entre 100 y 10.000 es "+sumaValores);
    }

}
