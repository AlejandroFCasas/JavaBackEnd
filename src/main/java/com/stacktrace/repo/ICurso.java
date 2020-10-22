package com.stacktrace.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stacktrace.model.Curso;

@Repository
public interface ICurso extends JpaRepository<Curso, Integer>{ 
	Curso findByNombre (String nombre);
}
