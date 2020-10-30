package com.stacktrace.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Curso")
public class Curso {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nombre", length = 50)
	private String nombre;
	/*
	@OneToOne
	@Column(name="profesor", length = 50)
	private Profesor profesor;
	*/
	@Column(name="duracionHoras", length = 50)
	private int duracionHoras;
	
	@Column(name="descripcion", length = 50)
	private String descripcion;
	
	@Column(name="notaAprobacion", length = 50)
	private int notaAprobacion;



	@ManyToMany(cascade = {
			CascadeType.PERSIST,
			CascadeType.MERGE})
	@JoinTable(name="alumno_cursos",
			joinColumns= {@JoinColumn(name ="alumno_id")},
			inverseJoinColumns= {@JoinColumn(name="alumno_nombre")}
			)

	private List <Alumno> alumnos;	
	
	public Curso () {
	alumnos = new ArrayList<Alumno>();
	}
	public Curso (String nombre) {
		this.nombre=nombre;
	}
	
	
	public Curso (int idCurso, String nombreCurso, int duracionHoras, String descripcion, int notaAprobacion) {
		this.id=idCurso;
		this.nombre=nombreCurso;
		this.duracionHoras=duracionHoras;
		this.descripcion=descripcion;
		this.notaAprobacion=notaAprobacion;
		this.alumnos = new ArrayList<Alumno>();

	}

	public int getIdCurso() {
		return id;
	}


	public void setIdCurso(int idCurso) {
		this.id = idCurso;
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

	public List<Alumno> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}



	
	
	
}
