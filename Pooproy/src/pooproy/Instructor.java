
package pooproy;
public class Instructor extends Empleado {
    //Atributos
    private String programa;
    
   //Constructor

    public Instructor() {
    }

    public Instructor(String programa, String profesion, int document, String nombre, String apellido, String correo) {
        super(profesion, document, nombre, apellido, correo);
        this.programa = programa;
    }
    //Encapsulamiento

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }
    
    //Metodos
    
    @Override
    public void mostrarDatos () {
        super.mostrarDatos();
        System.out.println("Instrusctor{ programa"+programa);
    }
    
}
