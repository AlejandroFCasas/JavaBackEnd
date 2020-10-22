package com.stacktrace.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.stacktrace.model.Profesor;
import com.stacktrace.repo.IProfesor;

@RestController
@RequestMapping("/Profesores")
public class RestDemoController2 {

	@Autowired
	private IProfesor repo; 
	
	@GetMapping
	public List<Profesor> listar(){
		return repo.findAll();
	}
	
	@PostMapping
	public void insertar (@RequestBody Profesor per){
		repo.save(per);
	}
	
	@PutMapping
	public void modificar (@RequestBody Profesor per){
		repo.save(per);
	}
	
	@DeleteMapping(value = "/{nro_documento}")
	public void eliminar (@PathVariable("nro_documento") Integer id){
		repo.deleteById(id);
	}
	
	
}
