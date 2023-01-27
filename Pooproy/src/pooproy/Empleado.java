package pooproy;

public abstract class Empleado extends Persona{
    
    //atributos
    protected String profesion;
    
    //Constructor

    public Empleado() {
    }

    public Empleado(String profesion, int document, String nombre, String apellido, String correo) {
        super(document, nombre, apellido, correo);
        this.profesion = profesion;
    }
    
    //Encapsulamiento

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    //Metodos
    
    public void mostrarDatos( ) {
               System.out.println(super.toString( ) + "Profesion="+profesion);
    }
         }
