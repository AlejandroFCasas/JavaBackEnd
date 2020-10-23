package com.stacktrace.repo;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stacktrace.model.Alumno;


@Repository
//public interface IAlumno extends JpaRepository<Alumno, Integer>{ 
public interface IAlumno extends CrudRepository <Alumno, Integer>{ 

	
	
	
	
}
