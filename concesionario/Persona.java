package Poo;

public abstract class Persona {
    //Atributos
    protected int documento;
    protected String nombre;
    protected String apellido;
    protected String correo;

    //Constructores

    public Persona() {

    }

    public Persona(int documento, String nombre, String apellido, String correo) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

    //Encapsulamiento

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    //Metodos
    public abstract void mostrarDatos();

    @Override
    public String toString() {
        return "Poo.Persona{" +
                "documento: " + documento +
                ", nombre: '" + nombre + '\'' +
                ", apellido: '" + apellido + '\'' +
                ", correo: '" + correo + '\'' +
                '}';
    }
}
