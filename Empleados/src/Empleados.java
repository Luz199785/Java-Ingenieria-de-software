import java.util.Scanner;

//1. nombre de la clase
public class Empleados {

    //2. atributos de la clase
    String identificacion;
    String nombres;
    String email;
    int edad;
    float sueldo;
    float vrHora;
    int horasTrabajadas;
    int nacimiento;

    //3. Metodos de la clase
    public void solicitarInformacion() {
        Scanner entradaC = new Scanner(System.in);

        System.out.print("** DATOS DEL EMPLEADO **");
        System.out.println();
        System.out.println("Ingrese los datos solicitados");

        System.out.print("Identificación: ");
        identificacion = entradaC.next();

        entradaC.nextLine();
        System.out.print("Nombres: ");
        nombres = entradaC.nextLine();
        entradaC.nextLine();

        System.out.print("Email: ");
        email = entradaC.next();

        System.out.print("Valor Hora: ");
        vrHora = entradaC.nextFloat();

        System.out.print("Horas Laboradas: ");
        horasTrabajadas = entradaC.nextInt();

        System.out.print("Año de Nacimiento: ");
        nacimiento = entradaC.nextInt();
    }

    public void imprimirInformacionEmpleado() {
        System.out.println(" ** Informacion Empleado **");
        System.out.println("El empleado " + nombres + " con identificacion " + identificacion);

    }

    public void calcularSueldo() {
        sueldo = vrHora * horasTrabajadas;
        System.out.println("El sueldo es: " + sueldo);
    }

    public int calcularEdad() {
        edad = 2022 - nacimiento;
        System.out.println("Edad " + edad);
        return edad;
    }

}
