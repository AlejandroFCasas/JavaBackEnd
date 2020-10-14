package com.mitocode;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

import com.mitocode.model.Usuario;
import com.mitocode.repo.IUsuarioRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoWebApplicationTests {
	@Autowired
	private IUsuarioRepo repo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	@Test
	public void crearUsuarioTest() {
		Usuario us = new Usuario();
		us.setId(4);
		us.setNombre("codex");
		us.setClave(encoder.encode("123"));
		repo.save(us);
		Usuario retorno = repo.save(us);
		assertTrue(retorno.getClave().equalsIgnoreCase(us.getClave()));
		
	}



}
