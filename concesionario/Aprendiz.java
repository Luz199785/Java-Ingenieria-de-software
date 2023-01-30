package Poo;

public class Aprendiz extends Persona {
    //Atributos
    private int ficha;

    //Constructor

    public Aprendiz() {

    }

    public Aprendiz(int ficha) {
        this.ficha = ficha;
    }

    public Aprendiz(int documento, String nombre, String apellido, String correo, int ficha) {
        super(documento, nombre, apellido, correo);
        this.ficha = ficha;
    }

    //Getter y Setter

    public int getFicha() {
        return ficha;
    }

    public void setFicha(int ficha) {
        this.ficha = ficha;
    }

    public void mostrarDatos() {
        System.out.println(super.toString() + " " + "Ficha: " + ficha);
    }
}
