
package com.proyecto.backend.repository;

import com.proyecto.backend.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaInterface extends JpaRepository <Persona, Long> {
    
}
