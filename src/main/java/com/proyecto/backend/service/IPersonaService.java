

package com.proyecto.backend.service;

import com.proyecto.backend.model.Persona;


public interface IPersonaService {
    
    public boolean buscarPersona(Persona pers);
    
    public void crearPersona (Persona pers);
}
