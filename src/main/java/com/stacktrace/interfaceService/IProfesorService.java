package com.stacktrace.interfaceService;
import java.util.List;
import java.util.Optional;
import com.stacktrace.model.Profesor;

public interface IProfesorService {
	Profesor findByNombre (String nombre);
	public List<Profesor> listar();
	public Optional<Profesor>listarId(int nroDocumento);
	public int save(Profesor A);
	public void delete(int id);
}
