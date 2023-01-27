package pooproy;
public class Administrativo extends Empleado {
    //Atributos
    private String area;
    
    //Constructor

    public Administrativo() {
    }

    public Administrativo(String area, String profesion, int document, String nombre, String apellido, String correo) {
        super(profesion, document, nombre, apellido, correo);
        this.area = area;
    }
            
    //Encapsulamiento

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    //Metodos

    @Override
    public void mostrarDatos () {
       super.mostrarDatos();
        System.out.println("Administrativo - Area="+area);
    }
    
}
