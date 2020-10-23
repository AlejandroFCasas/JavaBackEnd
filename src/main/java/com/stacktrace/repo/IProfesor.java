package com.stacktrace.repo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stacktrace.model.Profesor;


@Repository
public interface IProfesor extends CrudRepository <Profesor, Integer>{ 

}