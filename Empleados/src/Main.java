public class Main {
    public static void main(String[] arg){
        
        Empleados objEmpleado = new Empleados();
        Sucursal objSucursal = new Sucursal();
        
        objEmpleado.solicitarInformacion();
        objEmpleado.calcularEdad();
        objEmpleado.calcularSueldo();
        System.out.println("");
        objEmpleado.imprimirInformacionEmpleado();
        
        
        objSucursal.registrarSucursal();
        objSucursal.imprimirInfoSucursal();
        
      