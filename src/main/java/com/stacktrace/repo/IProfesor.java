package com.stacktrace.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.stacktrace.model.Profesor;

@Repository
public interface IProfesor extends JpaRepository<Profesor, Integer>{ 
	Profesor findByNombre (String nombre);
}
