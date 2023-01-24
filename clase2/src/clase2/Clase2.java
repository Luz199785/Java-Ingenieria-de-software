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
