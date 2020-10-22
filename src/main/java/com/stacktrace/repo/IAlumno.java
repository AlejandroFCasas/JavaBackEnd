package com.stacktrace.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stacktrace.model.Alumno;


@Repository
public interface IAlumno extends JpaRepository<Alumno, Integer>{ 
	Alumno findByNombre (String nombre);
}
