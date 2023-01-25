package factorial;
import java.util.Scanner;
/**
 *
 * @author Aprendiz
 */
public class CamaraDiputados {
    public static void main(String[] args) {
        
        //Entrada
        Scanner lector=new Scanner(System.in);
        int numbdiputados=0;
        double afavor = 0;
        double abstiene = 0;
        double encontra = 0;
        int voto;
        int totalVotos;
        
        totalVotos=numbdiputados;
                
        
        System.out.println("Ingrese cantodad de diputados a votar");
        numbdiputados=lector.nextInt();
        
        
        //proceso
        while(numbdiputados > 0){
            System.out.println("Ingrese su voto\n1=a favor\n2=en contra\n3=se abstiene");
            voto=lector.nextInt();
            switch (voto){
                    case 1:
                    afavor=afavor+1;
                    break;
                    case 2:
                    encontra=encontra+1;
                    break;
                    case 3:
                    abstiene=abstiene+1;
                    break;
            }numbdiputados=numbdiputados-1;
        }
        afavor=afavor/totalVotos;
        encontra=encontra/totalVotos;
        abstiene=abstiene/totalVotos;
        System.out.println("El porcentaje de votos a favor es: "+afavor*100+"%");
        System.out.println("El porcentaje de votos en contra es:"+encontra*100+"%");
        System.out.println("El porcrntaje de votos que se abstienen de votar es:"+abstiene*100+"%");
       
    }

}
/*