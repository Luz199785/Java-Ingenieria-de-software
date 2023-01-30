package Poo;

public class Instructor extends Empleado{
    //Atributos
    private String programa;

    //Constructor

    public Instructor() {

    }

    public Instructor(int documento, String nombre, String apellido, String correo, String profesion, String programa) {
        super(documento, nombre, apellido, correo, profesion);
        this.programa = programa;
    }


    //Getter y Setter

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    //Metodos
    public void mostrarDAtos() {
        super.mostrarDatos();
        System.out.println("Instructor - Programa: " + programa);
    }

}
