package com.stacktrace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;

import com.stacktrace.controller.DemoController;
import com.stacktrace.model.Alumno;
import com.stacktrace.model.Curso;

@SpringBootApplication
public class DemoWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoWebApplication.class, args);
		
		
		System.out.println("asd");
		
		
		
		Alumno Ale = new Alumno (11222333,"asdasd","asdasd","asdasd","asdasd","asdasd","asdasd",11223333);
		
		Curso matematica2 = new Curso (1122333,"matematicas",1122,"matematicas",8);
		

		
		
		
		
		

	}

}
