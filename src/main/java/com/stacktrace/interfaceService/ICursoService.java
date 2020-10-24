package com.stacktrace.interfaceService;
import java.util.List;
import java.util.Optional;
import com.stacktrace.model.Curso;

public interface ICursoService {
	public List<Curso> listar();
	public Optional<Curso>listarId(int idCurso);
	public int save(Curso A);
	public void delete(int id);
}
