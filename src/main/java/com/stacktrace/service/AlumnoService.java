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
import com.stacktrace.model.Alumno;
import com.stacktrace.repo.IAlumno;

@Service
public class AlumnoService implements IAlumnoService{

	@Autowired
	private IAlumno data;
	
	
	@Override
	public Alumno findByNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Alumno> listar() {

		return (List<Alumno>)data.findAll();	
		}

	@Override
	public Optional<Alumno> listarId(int nroDocumento) {
		return data.findById(nroDocumento);
	}

	@Override
	public int save(Alumno A) {
		int res=0;
		Alumno alumno=data.save(A);
		if (!alumno.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}
}
