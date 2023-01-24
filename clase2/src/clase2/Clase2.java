package clase2;

import java.util.Scanner;

/**
 *
 * @author Aprendiz
 */
public class Clase2 {
    public static void main(String[] args) {
     
        //Entrada
        //1h=10.000 mts
        //Superficie
        
        
        Scanner leer = new Scanner(System.in);
        
        
        //Definir variables
        int superficieTotal;
        double superficiePinos, superficieOyameles,superficieCedro;
        int cantidadPinos, cantidadOyameles, cantidadCedros;
        
        
        System.out.println("Ingrese la cantidad de hectareas de la superficie");
        superficieTotal= leer.nextInt();
        
        
        
        //Proceso
        //pasar hectareas a metros cuadrados 1h=10000 mts (conversion)
        superficieTotal=superficieTotal*10000;
        
        //comparar la superficie si es mayor a un millon
        if (superficieTotal > 1000000){
        //superficiePinos 70%  -> en 10 mts caben 8 pinos
        superficiePinos=superficieTotal*0.70;
        
        //superficieOyamel 20% -> en 15 mts caben 15 oyameles
        superficieOyameles=superficieTotal*0.20;
      
        //superficieCedro  10%  -> en 18 mts caben 10 cedros
        superficieCedro=superficieTotal*0.10;
        }
        
        
      //si no
         //superficiePinos 50%
        else {
            superficiePinos =superficieTotal*0.50:
            
            //superficieOyamel 30%
            superficieOyameles=superficieTotal*0.30;
             //superficieCedro 10%
             
            superficieCedro=superficieTotal*0.20;
             }
     
      
        cantidadPinos=(int)(superficiePinos*8/10);
        cantidadOyameles=(int) superficieOyameles*15/15;
        cantidadCedros=(int) superficieCedro*10/18;
        
       
        
        
        //Salida
        //cantidadPinos
        System.out.println("La cantidad de pinos a sembrar es: "+cantidadPinos);
        
        //cantidadOyamel
        System.out.println("La cantidad de Oyameles a sembrar es: "+cantidadOyameles);
        
        //cantidadCedro
        System.out.println("La cantidad de cedros a cembrar es: " +cantidadCedros);
        }

}



Switch

package clase2;

/**
 *
 * @author Aprendiz
 */
public class Switch {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int mes;
        System.out.println("Ingrese el numero del mes");
        mes=lectura.nextInt();
        
        
        if (mes>=1 && mes<=12){
            //codigo
            switch(mes)
                case 1:
                    System.out.println("El mes tiene 31 dias");
                    break;
                case 2: 
                     System.out.println("El mes tiene 28 dias");
                    break;
                case 3: 
                     System.out.println("El mes tiene 31 dias");
                    break;
                case 4: 
                     System.out.println("El mes tiene 30 dias");
                    break;
                case 5: 
                     System.out.println("El mes tiene 31 dias");
                    break;
                case 6: 
                     System.out.println("El mes tiene 30 dias");
                    break;
                case 7: 
                     System.out.println("El mes tiene 31 dias");
                    break;
                case 8: 
                     System.out.println("El mes tiene 31 dias");
                    break;
                case 9: 
                     System.out.println("El mes tiene 30 dias");
                    break;
                case 10: System.out.println("El mes tiene 31 dias");
                    break;
                case 11: System.out.println("El mes tiene 30 dias ");
                    break;
                case 12:
                         System.out.println("El mes tiene 31 dias");
                    break;
                 
                default:
                    throw new AssertionError();
                    
                }
        }
       
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////

FOR

package ciclos;

import java.util.Scanner;

/**
 *
 * @author Aprendiz
 */
public class Ciclos {
    public static void main(String[] args) {
        
     
        Scanner lectura = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese el numero para generar la tabla de multiplicacion");
        numero = lectura.nextInt();
        
        for (int i = 1; i < 10; i++) {
            System.out.println(numero + "*" + "=" + numero*i);
            
        }
       
    }

}



/////////////////////////////////////////////////////////////
package ciclos.Reloj;

/**
 *
 * @author Aprendiz
 */
public class Reloj {
    public static void main(String[] args) {
        
        for (int h = 0; h <= 23; h++) {
            for (int m = 0; m <= 59; m++) {
                for (int s = 0; s <= 59; s++) {
                    System.out.println(h+":"+m+":"+s);
                    
                    
                }
                
            }
            
        }
    }

}


