package pooproy;
public class Aprendiz extends Persona {
        //Atributos
        private int ficha;
        
        //Constructores
        
        public Aprendiz ( ) {
        }

    public Aprendiz(int ficha, int document, String nombre, String apellido, String correo) {
        super(document, nombre, apellido, correo);
        this.ficha = ficha;
    }
    
    //Encapsulamiento

    public int getFicha() {
        return ficha;
    }

    public void setFicha(int ficha) {
        this.ficha = ficha;
    }
    
    public void mostrarDatos ( ) {
        
        System.out.println(super.toString()+"Ficha="+ficha);
    }

    @Override
    public String toString() {
        return "Aprendiz{" + "ficha=" + ficha + '}';
    }
    
    }
