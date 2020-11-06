package com.stacktrace.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stacktrace.interfaceService.IAlumnoService;
import com.stacktrace.interfaceService.ICursoService;
import com.stacktrace.interfaceService.IProfesorService;
import com.stacktrace.model.Alumno;
import com.stacktrace.model.Curso;
import com.stacktrace.model.Profesor;


@Controller //redireccionar la peticion del usuario hacia una logica de negocio 
@RequestMapping
public class DemoController {


	//inyeccion a la parte del DAO
	@Autowired
	private IAlumnoService serviceAlumno; 
	
	@Autowired
	private IProfesorService serviceProfesor; 
	

	@Autowired
	private ICursoService serviceCurso; 
	

	
	
	@GetMapping("/listarAlumnos") 
	public String listarAlumnos(Model model) {
		List<Alumno>alumno=serviceAlumno.listar();
		model.addAttribute("alumnos", alumno);
		return "alumnos";
	}
	
	
	@GetMapping("/newAlumno")
	public String agregarAlumno(Model model) {
		model.addAttribute("alumno", new Alumno());
		List<Curso>curso=serviceCurso.listar();
		model.addAttribute("cursos", curso);
		return "formAlumno";
	}
	
	
	@PostMapping("/saveAlumno")
	public String save ( Alumno a, Model model) {
		serviceAlumno.save(a);
		return "redirect:/listarAlumnos";
	}

	@GetMapping("/editarAlumno/{nroDocumento}")
	public String editarAlumno(@PathVariable int nroDocumento, Model model) {
		Optional <Alumno> alumno=serviceAlumno.listarId(nroDocumento);
		model.addAttribute("alumno", alumno);
		return "formAlumno";
	}
	
	
	
	
	@GetMapping("/eliminarAlumno/{nroDocumento}")
	public String deleteAlumno (Model model, @PathVariable int nroDocumento) {
		serviceAlumno.delete(nroDocumento);
		return "redirect:/listarAlumnos"; 
	}

	@GetMapping("/agregarCursoAlumno/{nroDocumento}")
	public String AlumnosPorCursoId (Model model, @PathVariable int nroDocumento) {
		List<Curso>curso=serviceCurso.listar();
		Optional<Alumno>alumno=serviceAlumno.listarId(nroDocumento);
		model.addAttribute("cursos", curso);
		model.addAttribute("alumnos",alumno );
		return "/agregarCursoAlumno"; 
	}
	
	

	@GetMapping("/inscribirAlumno")
	public String inscribirAlumno (Model model) {
		List<Curso>curso=serviceCurso.listar();
		List<Alumno>alumno=serviceAlumno.listar();
		model.addAttribute("cursos", curso);
		model.addAttribute("alumnos", alumno);
		return "inscribirAlumno"; 
	}
	/*
	
	//insertar inscripcion
	//@ResponseStatus(value = HttpStatus.OK)
	//@GetMapping("/{usuID}/{fechaIni}/{fechaFin}")
	@GetMapping("/{idAlumno}/{idCurso}")
	public String inscribirAlumno (Model model, @PathVariable int idAlumno,@PathVariable int idCurso) {
		
		jdbcTemplate.update("INSERT INTO alumnos_curso VALUES (idAlumno, idCURSO,)", idAlumno, idCURSO);
		//return al index
	}
	
	/*
	public interface AuthorRepository extends JpaRepository<Author, Long> {
 
    	
    	
}
	
	
	final String SELECT_BY_ID_QUERY = "SELECT id, name, age from EMPLOYEE where id = ?";
	
	 public Employee findEmployee(int empId) {
	 
	 
    	return this.jdbcTemplate.queryForObject(SELECT_BY_ID_QUERY, new EmployeeMapper(),empId);
  }
  
	
		
	//Listar cursos by idAlumno
	
	@GetMapping("/listarCursosByidAlumno/{idAlumno}") 
	public String listarAlumnoByCurso(Model model,@PathVariable int idAlumno) {
	
	select * from alumnos_curso where idAlumno = idAlumno;
	
	this.jdbcTemplate.queryForObject("SELECT * from cursos where idCurso = ?"idCurso;, new EmployeeMapper(),empId);
	///*int result = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM EMPLOYEE", Integer.class);
	//@Query(value = "SELECT * FROM author WHERE first_name = :firstName", nativeQuery = true)
	//List<Cursos> CursosByIdAlumno(@Param("idAlumno") String idAlumno);
	
	
	model.addAttribute("cursos", curso);
	return "cursos";
	}
	
	
	
	/*int result = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM EMPLOYEE", Integer.class);
	para el select segun idcurso o idalumno
	
	String SELECT_BY_ID = "SELECT COUNT(*) FROM EMPLOYEE WHERE FIRST_NAME = :firstName";
	
	
	//para el index
	@Override
public void addViewControllers(ViewControllerRegistry registry) {
       registry.addViewController("/").setViewName("forward:/index.html");
}
	@Controller
	public class HomeController {
       @RequestMapping(value = "/")
       public String index() {
           return "index"; // no era index
       }

}
	*/
	
	

	
	
	
	
	
	@GetMapping("/listarProfesores") 
	public String listarProfesores(Model model) {
		List<Profesor>profesor=serviceProfesor.listar();
		model.addAttribute("profesores", profesor);
		
		return "profesores";
	}
	
	@GetMapping("/newProfesor")
	public String agregarProfesor(Model model) {
		model.addAttribute("profesor", new Profesor());
		return "formProfesor";
	}
	@PostMapping("/saveProfesor")
	public String save ( Profesor a, Model model) {
		serviceProfesor.save(a);
		return "redirect:/listarProfesores";
	}
	
	@GetMapping("/editarProfesor/{nroDocumento}")
	public String editarProfesor(@PathVariable int nroDocumento, Model model) {
		Optional <Profesor> profesor=serviceProfesor.listarId(nroDocumento);
		model.addAttribute("profesor", profesor);
		return "formProfesor";
	}
	
	@GetMapping("/eliminarProfesor/{nroDocumento}")
	public String deleteProfesor (Model model, @PathVariable int nroDocumento) {
		serviceProfesor.delete(nroDocumento);
		return "redirect:/listarProfesores"; 
	}
	
	
	@GetMapping("/listarCursos") 
	public String listarCursos(Model model) {
		//logica
		List<Curso>curso=serviceCurso.listar();
		model.addAttribute("cursos", curso);
		return "cursos";
	}
	@GetMapping("/newCurso")
	public String agregarCurso(Model model) {
		model.addAttribute("curso", new Curso());
		return "formCurso";
	}
	@PostMapping("/saveCurso")
	public String save ( Curso a, Model model) {
		serviceCurso.save(a);
		return "redirect:/listarCursos";
	}
	@GetMapping("/editarCurso/{idCurso}")
	public String editarCurso(@PathVariable int idCurso, Model model) {
		Optional <Curso> curso=serviceCurso.listarId(idCurso);
		model.addAttribute("curso", curso);
		return "formCurso";
	}
	
	@GetMapping("/eliminarCurso/{idCurso}")
	public String deleteCurso (Model model, @PathVariable int idCurso) {
		serviceCurso.delete(idCurso);
		return "redirect:/listarCursos"; 
	}
	
	
}
