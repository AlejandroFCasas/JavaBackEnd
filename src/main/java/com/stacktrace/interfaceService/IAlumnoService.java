package com.stacktrace.interfaceService;

import java.util.List;
import java.util.Optional;

import com.stacktrace.model.Alumno;

public interface IAlumnoService {
	Alumno findByNombre (String nombre);
	public List<Alumno> buscarByCurso(String NombreCurso);
	public List<Alumno> listar();
	public Optional<Alumno>listarId(int nroDocumento);
	public int save(Alumno A);
	public void delete(int id);

}
