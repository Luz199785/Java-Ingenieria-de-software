package Poo;

public abstract class Empleado extends Persona{
    //Atributos
    protected String profesion;

    //Constructor
    public Empleado () {

    }

    public Empleado(String profesion) {
        this.profesion = profesion;
    }

    public Empleado(int documento, String nombre, String apellido, String correo, String profesion) {
        super(documento, nombre, apellido, correo);
        this.profesion = profesion;
    }

    //Getter y Setter
    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    //Metodos

    public void mostrarDatos() {
        System.out.println(super.toString() + " Profesion: " + profesion);
    }
}
