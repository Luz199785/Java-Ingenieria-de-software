package clase2;

import java.util.Scanner;

/**
 *
 * @author Aprendiz
 */
public class multiples {
    
    public static void main(String[] args) { //psvm
        Scanner leer=new Scanner(System.in);
        
        //Entrada
        double kilos,descuento;
        int precioKilo;
        int totalPagar;
        
        System.out.println("Ingrese el valor del kilo");
        precioKilo=leer.nextInt();
        System.out.println("Ingrese la cantidad de kilos comprados");
        kilos=leer.nextDouble();
        
        if (kilos>=2){
            descuento=0;
        }
        else if (kilos>2 && kilos<=5)
        {
        descuento =0.10;  
        }
        else if (kilos>5 && kilos <=10){
            descuento = 0.15;
        }
        else {
            descuento=0.20;
        }
        
        totalPagar = (int)(kilos*precioKilo-kilos*precioKilo*descuento);
                
         //salida
         System.out.println("El total a pagar es: " +totalPagar);
              
    }

}
