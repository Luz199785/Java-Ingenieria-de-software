package pooproy;
public abstract class Persona {
    //Atributos
    protected int document;
    protected String nombre;
    protected String apellido;
    protected String correo;
    
    //Constructores

    public Persona() {
    }

    public Persona(int document, String nombre, String apellido, String correo) {
        this.document = document;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }
    
    //Encapsulamiento

    public int getDocument() {
        return document;
    }

    public void setDocument(int document) {
        this.document = document;
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
    
    public abstract void mostrarDatos( ) ; 

    @Override
    public String toString() {
        return "Persona{" + "document=" + document + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + '}';
    

        
    
    }

    
  
       
  
}
