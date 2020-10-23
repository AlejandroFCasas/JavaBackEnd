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

import com.stacktrace.model.Alumno;
import com.stacktrace.repo.IAlumno;

@RestController
@RequestMapping("/Alumnos")
public class RestDemoController {

	@Autowired
	private IAlumno repo; 
	

	@PostMapping
	public void insertar (@RequestBody Alumno per){
		repo.save(per);
	}
	
	@PutMapping
	public void modificar (@RequestBody Alumno per){
		repo.save(per);
	}
	
	@DeleteMapping(value = "/{nro_documento}")
	public void eliminar (@PathVariable("nro_documento") Integer id){
		repo.deleteById(id);
	}
	
	
}
