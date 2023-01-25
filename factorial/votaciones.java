package factorial;
import java.util.Scanner;
/**
 *
 * @author Aprendiz
 */
public class votaciones {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        int norte=0;
        int sur=0;
        int centro=0;
        int opcion=1;
        
        while (opcion!=0){
            System.out.println("Ingrese la opcion\n1=norte\n2=sur\n3=centro\n0=salir");
            opcion=lector.nextInt();
            
            switch (opcion){
                case 1:
                    norte++;
                    break;
                case 2:
                    sur++;
                    break;
                case 3:
                    centro++;
                    break;
                    
                
            }
           
        }
        System.out.println("La cantidad de votantes de norte son: "+norte);
            System.out.println("La cantidad de votantes de sur son: "+sur);
            System.out.println("La cantidad de votantes de centro son: "+centro);
            
            if (norte>sur && norte>sur){
                System.out.println("La seccion norte tiene mas votantes");
            }
                else if (sur>norte && sur>centro){
                        System.out.println("La seccion sur tiene mas votantes");
                }
                        else if (centro>sur && centro>centro){
                        System.out.println("La seccion centro tiene mas votantes");
                        }
            
               
    }

}
