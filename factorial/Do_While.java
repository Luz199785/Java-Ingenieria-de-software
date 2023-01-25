package factorial;
import java.util.Scanner;
/**
 *
 * @author Aprendiz
 */
public class Do_While {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        int venta,totalVentas=0;
        do{ //Por lo menos una vez muestra esto
        //
            System.out.println("Ingrese el valor de la venta o 0 para salir");
            venta=lectura.nextInt();
            totalVentas=totalVentas+venta; //totalVentas+=venta;
        }while(venta!=0);
        
        System.out.println("El valor de la vrnta total es "+totalVentas);
        
    }

}
