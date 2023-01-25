package factorial;
import java.util.Scanner;

/*Diseñe un algoritmo que lea dos vectores A y B de 20 elementos cada uno y 
multiplique el primer elemento de A con el ultimo elemento de B y 
luego el segundo elemento de A por el diecinueveavo elemento de B y así s
ucesivamente hasta llegar al veinteavo elemento de A por el primer elemento de B. 
El resultado de la multiplicación almacenarlo en un vector C.
 */
public class Multipl_Vectores {
    public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);
    
    //Declarar vector
    int vector1 [] = new int[5];
    int vector2 []= new int [5];
    int union [] = new int [5];
    
    //Leer vector
        for (int i = 0; i <5 ; i++) {
            System.out.println("Ingrese el valor del vector A en su posicion "+ i+1);
            vector1[i]=lectura.nextInt();
            System.out.println("Ingrese el valor del vector B en su posicion "+ i+1);
            vector1[i]=lectura.nextInt();
            
        }
        
        for (int i = 0; i <5; i++) {
       
          union[i]=vector1[i]*vector2[4-i];
            System.out.println(union[i]);
               
            
        }
        
    }
}
