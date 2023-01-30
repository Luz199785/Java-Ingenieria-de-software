package Poo;

public class Main {
    public static void main(String[] args) {

      Persona persona;

      Registro registro = new Registro();
      persona = new Aprendiz(80560, "Pedro", "Perez", "pedro@gmail.com", 259750);
      registro.registrar(persona);

      persona = new Instructor(123456, "Juan", "Reyes", "juan@gmail.com", "Ingeniero", "ADSO");
      registro.registrar(persona);

      persona = new Administrativo(123456, "Daniel", "Ruiz", "daniel@gmail", "Contador", "Financiera");
      registro.registrar(persona);

      registro.consultar();

    }
}