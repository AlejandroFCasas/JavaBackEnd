package com.stacktrace.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stacktrace.interfaceService.ICursoService;
import com.stacktrace.model.Alumno;
import com.stacktrace.model.Curso;
import com.stacktrace.model.Profesor;
import com.stacktrace.repo.ICurso;
@Service
public class CursoService implements ICursoService{

	@Autowired
	private ICurso data;

	@Override
	public List<Curso> listar() {
		return  (List<Curso>)data.findAll();
	}
	
	
	

	@Override
	public Optional<Curso> listarId(int idCurso) {
		// TODO Auto-generated method stub
		return data.findById(idCurso);
	}

	@Override
	public int save(Curso A) {
		int res=0;
	Curso curso=data.save(A);
	if (!curso.equals(null)) {
		res=1;
	}
	return res;
}

	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}


}
