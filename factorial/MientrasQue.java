package factorial;

import java.util.Scanner;

/**
 *
 * @author Aprendiz
 */
public class MientrasQue {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        int numero;
       
        System.out.println("Ingrese un numero");
        numero = lectura.nextByte();
        
      if (numero>0){
          // proceso
      while(numero>=2){
        numero = numero - 2;  
      }    
          
      if(numero==0){
          System.out.println("El numero es par");
      }    
      else{
          System.out.println("El numero es impar");
      }
          
      } 
      else{
        System.out.println("El numero no es positivo para saber si es par o impar");
      }
               
    }

}
