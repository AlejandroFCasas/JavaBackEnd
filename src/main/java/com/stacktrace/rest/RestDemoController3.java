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
import com.stacktrace.model.Curso;
import com.stacktrace.model.Profesor;
import com.stacktrace.repo.IAlumno;
import com.stacktrace.repo.ICurso;

@RestController
@RequestMapping("/Cursos")
public class RestDemoController3 {

	@Autowired
	private ICurso repo; 
	
	@GetMapping
	public List<Curso> listar(){
		return repo.findAll();
	}
	
	@GetMapping("/{nombreCurso}")
	public void BuscarBynombre(@PathVariable("/nombreCurso") String nombre){
	
			repo.findByNombre(nombre);
		}
		
	
	@PostMapping
	public void insertar (@RequestBody Curso per){
		repo.save(per);
	}
	
	@PutMapping
	public void modificar (@RequestBody Curso per){
		repo.save(per);
	}
	
	@DeleteMapping(value = "/{nro_documento}")
	public void eliminar (@PathVariable("nro_documento") Integer id){
		repo.deleteById(id);
	}
	
	
}
