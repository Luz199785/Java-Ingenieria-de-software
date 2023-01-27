
package concesionario;

import java.util.List;
import java.util.ArrayList;


public class Registro {
    public List<Venta> listaVentas = new ArrayList();
    
    public void agrgarVenta(Venta venta){
        listaVentas.add(venta);
    }
    
    public  void consultarVentas(){
        for (Venta listaVenta : listaVentas) {
            System.out.println(listaVenta.toString());
            
        }
    }
}
