package pooproy;

public class Pooproy {
    public static void main(String[] args) {
  
        Persona persona;
        Registro registro=new Registro();
        
        persona=new Aprendiz(80160,259750,"Perdo","Perez","pdero@gmail.com");
        
        registro.registrar(persona) ;
        
        persona=new Instructor("ADSO","Ingeniero",123456,"Juan","Reyes","juan@gmail.com");
        
        registro.registrar (persona);
        
        persona=new Administrativo("Financiera","Contador",987456,"Daniel","Ruiz", "daniel@gmail.com");
        registro.registrar (persona);
        
        registro.consultar();
         
    }
    
}
