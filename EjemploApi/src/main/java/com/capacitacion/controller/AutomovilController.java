package com.capacitacion.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capacitacion.model.Automovil;
import com.capacitacion.repository.AutomovilRepository;



@RestController
@RequestMapping("/ApiAutomovil")
public class AutomovilController {

	@Autowired
    AutomovilRepository repository;

    @GetMapping("/automovil")
    public List<Automovil> getAllAutomoviles() {
        return repository.findAll();
    }

    @PostMapping("/automovil")
    public Automovil createAutomovil(@Valid @RequestBody Automovil automovil) {
        return repository.save(automovil);
    }

    @GetMapping("/automovil/{id}")
    public Automovil getAutomovilById(@PathVariable(value = "id") Long automovilId) {
        
    	return repository.findById(automovilId).get();
    	
    }

    @PutMapping("/automovil")
    public Automovil updateAutomovi(@Valid @RequestBody Automovil automovilDetails) {
    	
    	
    	Automovil automovil = null;
        boolean existe = repository.findById(automovilDetails.getAutomovilId()).isPresent();
        
        if (existe) {
        	
        	automovil = repository.save(automovilDetails);
		}
        	                     
        return automovil;
    }

    @DeleteMapping("/automovil/{id}")
    public ResponseEntity<?> deleteAutomovil(@PathVariable(value = "id") Long automovilId) {
    	    	
        boolean existe = repository.findById(automovilId).isPresent();
                
        if (existe) 
        {
        	repository.deleteById(automovilId);
        	return ResponseEntity.ok().build();
		}
        else 
        {
        	return ResponseEntity.notFound().build();
        }
			
    }
	
}
