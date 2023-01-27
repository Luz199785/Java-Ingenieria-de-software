package concesionario;

public class Vehiculo {
   private int codigo;
   private String marca;
   private int modelo;
   private int kilometraje;
   private int precio;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
   private TipoVehivulo tipo;

    public Vehiculo() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public TipoVehivulo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehivulo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "codigo=" + codigo + ", marca=" + marca + ", modelo=" + modelo + ", kilometraje=" + kilometraje + ", precio=" + precio + ", tipo=" + tipo + '}';
    }
   
    
   
   
}
