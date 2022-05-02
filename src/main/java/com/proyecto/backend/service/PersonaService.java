
package com.proyecto.backend.service;

import com.proyecto.backend.model.Persona;
import com.proyecto.backend.repository.PersonaInterface;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    public PersonaInterface persRepo;
    
    @Override
    public boolean buscarPersona(Persona pers){
        List<Persona> personas = persRepo.findAll();  
        
        boolean aprobado = false;        
        for (Persona persona : personas) {            
            if (persona.getUsuario().equals(pers.getUsuario())&& persona.getPassword().equals(pers.getPassword()) ){
                aprobado = true;                                
                break;
            }           
        }
        return aprobado;
    }

    @Override
    public void crearPersona(Persona pers) {
        persRepo.save(pers);        
    }
        
    
}
