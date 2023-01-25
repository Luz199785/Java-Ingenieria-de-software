
public class Arrays {
    public static void main(String[] args) {
        
  Scanner lectura = new Scanner(System.in);
  
  //Declarar vector
  int vector[] = new int [50]; //Vector y su Tamaño 
  double promedio;
  int suma=0,cantidadMayorProm=0;
  
  
  //Leer vector
 for(int i=0;i<50;i++){
 System.out.println("Ingrese un valor: ");
 vector[i]=lectura.nextInt();
 suma=suma+vector[i];
 }
 
 promedio=suma/50;
 System.out.println("El promedio es:  "+promedio);
 //Recorrer el vector
 System.out.println("La lista de valores mayores al promedio es: ");
 for(int i=0;i<50;i++){
 if(vector[i]>promedio){
 cantidadMayorProm++;  //Incrementamos en 1
 System.out.println(vector[i]);
         
     }
 }
 System.out.println("La cantidad de valores mayores al promedio es: "+cantidadMayorProm);
 
    }

}
