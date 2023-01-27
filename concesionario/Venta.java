/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import java.util.List;

/**
 *
 * @author Aprendiz
 */
public class Venta {
    
    //Atributos
    private int idVenta;
    private String fecha;
    private int monto;
    private Cliente cliente; // realizo la agregación objeto tipo cliente
    private List<Vehiculo> vehiculo; //son muchos vehiculos composicion

    //Constructor
    public Venta() {
    }

    public Venta(int idVenta, String fecha, Cliente cliente, <any> vehiculo) {
        int suma=0;
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        for(Vehiculo vehiculo : vehiculo){ //recorre los vehiculos
            suma=suma+vehiculo.getPrecio();
        }
        this.monto=suma;
    }
// Encapsulamiento
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public <any> getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(<any> vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Venta{" + "idVenta=" + idVenta + ", fecha=" + fecha + ", monto=" + monto + ", cliente=" + cliente + ", vehiculo=" + vehiculo + '}';
    }
    
}
