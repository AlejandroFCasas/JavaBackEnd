package com.stacktrace.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stacktrace.interfaceService.IAlumnoService;
import com.stacktrace.model.Alumno;
import com.stacktrace.model.Curso;
import com.stacktrace.model.Profesor;
import com.stacktrace.repo.IAlumno;
import com.stacktrace.repo.ICurso;
import com.stacktrace.repo.IProfesor;

@Controller //redireccionar la peticion del usuario hacia una logica de negocio 
@RequestMapping
public class DemoController {

	
	//inyeccion a la parte del DAO
	@Autowired
	private IAlumnoService service; 
	
	@Autowired
	private IProfesor repoprofe; 
	
	@Autowired
	private ICurso repocurso; 
	
	@GetMapping("/listar") 
	public String listar(Model model) {
		//logica
		List<Alumno>alumnos=service.listar();
		model.addAttribute("alumnos", alumnos);
		
		return "index";
	}
	

}
