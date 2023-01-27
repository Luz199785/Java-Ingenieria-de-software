
package concesionario;

import java.util.ArrayList;
import java.util.List;



public class Concesionario {

    
    public static void main(String[] args) {
        Registro registro=new Registro();
        
        Cliente cliente=new Cliente();
        cliente.setCedula(80160);
        cliente.setNombre("Nelson");
        cliente.setApellido("Rodriguez");
        
        Cliente cliente1=new Cliente();
        cliente1.setCedula(52689);
        cliente1.setNombre("Maria");
        cliente1.setApellido("Perez");
        
    //Vehiculos
    
        Vehiculo vehiculo=new Vehiculo();
        vehiculo.setCodigo(1);
        vehiculo.setMarca("Chevrolet");
        vehiculo.setModelo(2022);
        vehiculo.setKilometraje(0);
        vehiculo.setPrecio(25000000);
        vehiculo.setTipo(TipoVehivulo.AUTOMOVIL);
        
        Vehiculo vehiculo1=new Vehiculo();
        vehiculo1.setCodigo(2);
        vehiculo1.setMarca("Renault");
        vehiculo1.setModelo(2020);
        vehiculo1.setKilometraje(10000);
        vehiculo1.setPrecio(15000000);
        vehiculo1.setTipo(TipoVehivulo.AUTOMOVIL);
        
        Vehiculo vehiculo2=new Vehiculo();
        vehiculo2.setCodigo(3);
        vehiculo2.setMarca("AKT");
        vehiculo2.setModelo(2020);
        vehiculo2.setKilometraje(1000);
        vehiculo2.setPrecio(5000000);
        vehiculo2.setTipo(TipoVehivulo.MOTOCICLETA);
        
        Vehiculo vehiculo3=new Vehiculo();
        vehiculo3.setCodigo(4);
        vehiculo3.setMarca("Hyundai");
        vehiculo3.setModelo(2020);
        vehiculo3.setKilometraje(5000);
        vehiculo3.setPrecio(35000000);
        vehiculo3.setTipo(TipoVehivulo.CAMIONETA);
        
    //Ventas
        
        Venta venta1=new Venta();
        List<Vehiculo> vehiculos1=new ArrayList();
        
        vehiculos1.add(vehiculo);
        vehiculos1.add(vehiculo);
        
        venta1.setIdVenta(1);
        venta1.setVehiculos(vehiculos1);
        venta1.setCliente(cliente);
        venta1.setMonto(1);
        
        Venta venta2=new Venta();
        List<Vehiculo> vehiculos2=new ArrayList();
        
        venta2.setIdVenta(2);
        venta2.setVehiculos(vehiculos2);
        venta2.setCliente(cliente1);
        venta2.setMonto(2);
        
        registro.agrgarVenta(venta1);
        registro.agrgarVenta(venta2);
               
        registro.consultarVentas();

    }
    
}
