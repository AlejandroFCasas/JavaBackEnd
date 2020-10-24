package com.stacktrace.repo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stacktrace.model.Alumno;


@Repository
public interface IAlumno extends CrudRepository <Alumno, Integer>{ 

}
