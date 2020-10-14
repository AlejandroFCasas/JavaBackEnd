package com.mitocode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mitocode.model.Persona;
import com.mitocode.repo.IPersonaRepo;

@Controller //redireccionar la peticion del usuario hacia una logica de negocio 
public class DemoController {
	//http://localhost:8080/greeting?name=Ale
	
	//inyeccion a la parte del DAO
	@Autowired
	private IPersonaRepo repo; 
	
	
	
	@GetMapping("/greeting") /*gerMapping indica que se va a poder acceder a la funcion "greeting" en este caso, a través de la 
	operacion tipo Get*/
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		Persona p=new Persona();
		p.setIdPersona(2);
		p.setNombre("Mito");
		repo.save(p);
		
		model.addAttribute("name", name);
		return "greeting";
	}
	@GetMapping("/listar") 
	public String greeting(Model model) {
		//logica
		model.addAttribute("personas", repo.findAll());

		return "greeting";
	}
	

}
