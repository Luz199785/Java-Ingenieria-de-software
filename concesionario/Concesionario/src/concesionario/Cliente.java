
package concesionario;


public class Cliente {
  //Atributos
    private int documento;
    private String nombre;
    private String apellido;
    private String correo;
    
    //Constructores uno vacio y uno con todos los campos
    public Cliente(){
        
    }

    public Cliente(int documento, String nombre, String apellido, String correo) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }
    
    //Encapsulamiento clik derecho get - set

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
// clik derecho toString
    @Override
    public String toString() {
        return "Cliente{" + "documento=" + documento + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + '}';
    }
    
    
}
