package com.stacktrace.repo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stacktrace.model.Curso;


@Repository
public interface ICurso extends CrudRepository <Curso, Integer>{ 

}
