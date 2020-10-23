package com.stacktrace.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.stacktrace.interfaceService.IAlumnoService;
import com.stacktrace.interfaceService.IProfesorService;
import com.stacktrace.model.Alumno;
import com.stacktrace.model.Profesor;
import com.stacktrace.repo.IAlumno;
import com.stacktrace.repo.IProfesor;

@Service
public class ProfesorService implements IProfesorService{

	@Autowired
	private IProfesor data;
	
	@Override
	public Profesor findByNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Profesor> listar() {
		
		return  (List<Profesor>)data.findAll();
	}

	@Override
	public Optional<Profesor> listarId(int nroDocumento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Profesor A) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
