import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author monic
 */
//1. Nombre de clase
public class Sucursal {
    
//2. atributos de la clase
private int idSucursal;
private String nombre;
private String ubicacion;



//3. metodos de la clase    

    public Sucursal() {
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

   public void registrarSucursal(){
       Scanner entradaC = new Scanner(System.in);
       
       System.out.println("** INFORMACION SUCURSALES **");
       System.out.println("Ingrese la siguiente Información");
       System.out.println("");
       System.out.print("Codigo: ");
       idSucursal = entradaC.nextInt();
       
       System.out.print("Nombre: ");
       nombre = entradaC.next();
       
       System.out.println("Ubicación: ");
       ubicacion = entradaC.nextLine();
       entradaC.nextLine();
   }
    
   public void imprimirInfoSucursal(){
       System.out.println("** SUCURSALES **");
       System.out.println("La sucursal "+ nombre + " se encuentra en "+ ubicacion);
   }
}
