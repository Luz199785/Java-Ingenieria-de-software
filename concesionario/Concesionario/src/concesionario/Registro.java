/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aprendiz
 */
public class Registro {
    //En esta clase se trae clientes y vehiculos en ventas y monto
    List<Venta> listaVenta=new ArrayList();
    
    public void registrar(Venta venta){
        listaVenta.add(venta);
    }
    public void consultar(){
        for(Venta venta : listaVenta){
            System.out.println(venta.toString());
        }
        }
        
    }
    
}
