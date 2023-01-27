
package concesionario;

import java.util.List;


public class Venta {
  private int idVenta;
  private int monto;
  private Cliente cliente;
  private List<Vehiculo> vehiculos;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Venta() {
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> Vehiculos) {
        this.vehiculos = Vehiculos;
    }
    
    public void calcularMonto(){
        int suma=0;
        for (Vehiculo vehiculo: vehiculos){
        suma +=vehiculo.getPrecio();
       }
       
       this.monto = suma;
    }

    @Override
    public String toString() {
        return "Venta{" + "idVenta=" + idVenta + ", monto=" + monto + ", cliente=" + cliente + ", vehiculos=" + vehiculos + '}';
    }
    
    
    
    
  
}
