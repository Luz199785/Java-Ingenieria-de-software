
/*Hacer un algoritmo que almacene números en una matriz de 5 * 6. 
Imprimir la suma de los números almacenados en la matriz.
 */
package factorial;
import java.util.Scanner;




public class Matriz {
    public static void main(String[] args) {
    Scanner lectura=new Scanner(System.in);
    
    int matriz [][]=new int[5][6];
    int suma = 0;
    
    
    //Llenar la matriz
    
        for (int i = 0; i < 5; i++) {
            for (int j=0;j<6;j++){
                {
            
        matriz[i][j]=lectura.nextInt();
        suma=suma+matriz[i][j];
                }
            
        }
       
            System.out.println("La suma de los valores es"+suma);
    }

}
