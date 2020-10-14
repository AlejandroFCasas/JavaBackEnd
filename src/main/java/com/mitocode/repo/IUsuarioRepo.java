package com.mitocode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mitocode.model.Persona;
import com.mitocode.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer>{ 
	//persona, tipo de entidaad y la llave, un integer
//findBy es una palabra reservada
	Usuario findByNombre (String nombre);
}
