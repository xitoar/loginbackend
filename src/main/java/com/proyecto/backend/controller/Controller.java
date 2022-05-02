
package com.proyecto.backend.controller;

import com.proyecto.backend.model.Persona;
import com.proyecto.backend.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired  
     private IPersonaService persoServ;
    
    @CrossOrigin ("http://localhost:4200")
    @PostMapping ("/login")
    @ResponseBody
    public boolean login(@RequestBody Persona pers ){   
        
        return persoServ.buscarPersona(pers);
    }
    
    
    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers){
      persoServ.crearPersona(pers);
    }
      
    
}
