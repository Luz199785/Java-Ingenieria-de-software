package factorial;
import java.util.Scanner;

/**
 *
 * @author Aprendiz
 */
public class Factorial {
    public static void main(String[] args) {
       Scanner lectura = new Scanner(System.in);
       int  fac = 1;
       int  numero;
       
       
  System.out.println("Ingrese el numero a calcular el factorial");
  numero = lectura.nextInt();
        for (int i = 1; i <=numero; i++) {
            fac=fac*i;
            
        }
        System.out.println("El factoria de "+numero+"es"+fac);
        
    }

}
