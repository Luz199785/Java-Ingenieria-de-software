/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;


public class Vehiculo {
    //Atributos
    private String placa;
    private int modelo;
    private String marca;
    private int precio;
    
    
    //Constructor
    //clik derecho constructor solo
    public Vehiculo() {
    }
    
    
//Encapsulamiento

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "placa=" + placa + ", modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + '}';
    }

    
    
}
