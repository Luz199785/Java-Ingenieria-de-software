package Poo;

public class Administrativo extends Empleado{
    //Atributos
    private String area;

    //Constructor
    public Administrativo() {

    }

    public Administrativo(int documento, String nombre, String apellido, String correo, String profesion, String area) {
        super(documento, nombre, apellido, correo, profesion);
        this.area = area;
    }

    //Getter y Setter
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    //Metodos
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Administrativo - Area: " + area);
    }

}
