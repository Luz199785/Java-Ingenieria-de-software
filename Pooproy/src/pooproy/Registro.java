package pooproy;

import java.util.ArrayList;
import java.util. List;
public class Registro {
    
    List<Persona> listaPersonas =new ArrayList<>( );
    
    public void registrar(Persona persona) {
        listaPersonas.add(persona);
        
      }
    
    public void consultar( ) {
        for (Persona objetoPersona : listaPersonas) {
            objetoPersona.mostrarDatos();
            
        }
    
    }
    
}

