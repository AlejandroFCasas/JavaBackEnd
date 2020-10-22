package com.stacktrace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.stacktrace.model.Alumno;
import com.stacktrace.model.Curso;
import com.stacktrace.model.Profesor;
import com.stacktrace.repo.IAlumno;
import com.stacktrace.repo.ICurso;
import com.stacktrace.repo.IProfesor;

@Controller //redireccionar la peticion del usuario hacia una logica de negocio 
public class DemoController {

	
	//inyeccion a la parte del DAO
	@Autowired
	private IAlumno repo; 
	
	@Autowired
	private IProfesor repoprofe; 
	
	@Autowired
	private ICurso repocurso; 
	
	@GetMapping("/index") 

	public String index( String name, Model model) {
		
		//Alumno p=new Alumno(11222333,"dni","dni","Alumno","2012.10.23 20:20:45 PST,12","Alumno","F",6);
		Alumno p = new Alumno(1122333,"dni","nombre","apellido", "2012.10.23 20:20:45 PST,12","domicilioActual","F",6);
		///Profesor p = new Profesor(11222333,"dni","nombre","apellido", "2012.10.23 20:20:45 PST,12","domicilioActual","F",6);
		
		repo.save(p);
		//repoprofe.save(p);
		model.addAttribute("name", name);
		/*
		Profesor pp=new Profesor();
		repoprofe.save(pp);
		model.addAttribute("name", name);

		Curso ppp=new Curso();
		repocurso.save(ppp);
		model.addAttribute("name", name);
*/
		
		return "index";
	}
	@GetMapping("/listar") 
	public String listar(Model model) {
		//logica
		model.addAttribute("Alumnos", repo.findAll());

		return "greeting";
	}
	

}
