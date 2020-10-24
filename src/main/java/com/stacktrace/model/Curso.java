package com.stacktrace.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Curso")
public class Curso {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCurso;
	
	@Column(name="nombre", length = 50)
	private String nombre;
	
	
	@Column(name="duracionHoras", length = 50)
	private int duracionHoras;
	
	@Column(name="descripcion", length = 50)
	private String descripcion;
	
	@Column(name="notaAprobacion", length = 50)
	private int notaAprobacion;
	
	public Curso () {

	}
	
	
	public Curso (int idCurso, String nombreCurso, int duracionHoras, String descripcion, int notaAprobacion) {
		this.idCurso=idCurso;
		this.nombre=nombreCurso;
		this.duracionHoras=duracionHoras;
		this.descripcion=descripcion;
		this.notaAprobacion=notaAprobacion;

	}

	public int getIdCurso() {
		return idCurso;
	}


	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getNombreCurso() {
		return nombre;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombre = nombreCurso;
	}

	public int getDuracionHoras() {
		return duracionHoras;
	}

	public void setDuracionHoras(int duracionHoras) {
		this.duracionHoras = duracionHoras;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getNotaAprobacion() {
		return notaAprobacion;
	}

	public void setNotaAprobacion(int notaAprobacion) {
		this.notaAprobacion = notaAprobacion;
	}

	
	
	
}
