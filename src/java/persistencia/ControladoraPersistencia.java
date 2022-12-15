/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.List;
import java.util.logging.Level;
import logica.Persona;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    
    PersonaJpaController persJPA = new PersonaJpaController();
    
    public void crearPersona(Persona pers)
    {
    persJPA.create(pers);    
    }
    
    public void eliminarPersona (int id)
    {
        try {
            persJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            java.util.logging.Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarPersona (Persona pers)
    {
        try {
            persJPA.destroy(pers.getId());
        } catch (NonexistentEntityException ex) {
            java.util.logging.Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public List<Persona> traerPersonas()
    {
    return persJPA.findPersonaEntities();
    }
    
}