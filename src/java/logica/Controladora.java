
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearPersona (Persona pers)
    {
        controlPersis.crearPersona(pers);
    }
    
    public void eliminarPersona (int id)
    {
        controlPersis.eliminarPersona(id);
    }
    
    public void eliminarPersona (Persona pers)
    {
        controlPersis.eliminarPersona(pers);
    }
    
    public List<Persona> traerPersonas()
    {
        return controlPersis.traerPersonas();
    }
    
    
}
