package com.stacktrace.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stacktrace.interfaceService.IAlumnoService;
import com.stacktrace.interfaceService.IProfesorService;
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
	private IAlumnoService serviceAlumno; 
	
	@Autowired
	private IProfesorService serviceProfesor; 
	
	@Autowired
	private ICurso repocurso; 
	
	@GetMapping("/listarAlumnos") 
	public String listarAlumnos(Model model) {
		//logica
		List<Alumno>alumnos=serviceAlumno.listar();
		model.addAttribute("profesores", alumnos);
		
		return "index";
	}
	@GetMapping("/listarProfesores") 
	public String listar(Model model) {
		//logica
		List<Profesor>profesor=serviceProfesor.listar();
		model.addAttribute("profesores", profesor);
		
		return "index";
	}
	
}
