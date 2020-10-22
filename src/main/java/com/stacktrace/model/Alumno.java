package com.stacktrace.model;

import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="Alumno")
public class Alumno {
	@Id
	private int nroDocumento;

	@Column(name="tipoDeDocumento", length = 50)
	private String tipoDeDocumento;
	
	@Column(name="nombre", length = 50)
	private String nombre;
	
	@Column(name="apellido", length = 50)
	private String apellido;
	
	@Column(name="fechaNacimiento", length = 50)
	private String fechaNacimiento;
	
	@Column(name="domicilioActual", length = 50)
	private String domicilioActual;
	
	@Column(name="sexo", length = 50)
	private String sexo;
	
	@Column(name="telefono", length = 50)
	private int telefono;
	
	@Column(name="cursosInscriptos", length = 100)
	private ArrayList <Curso> cursosInscriptos;
	

	public Alumno() {
		
	}
	public Alumno(String nombre) {
		this.nombre = nombre;
	}

	public Alumno(int nroDocumento, String tipoDeDocumento,String nombre,
			String apellido,String fechaNacimiento, String domicilioActual,
			String sexo,int telefono){

		this.nroDocumento = 13;
		this.tipoDeDocumento = tipoDeDocumento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.domicilioActual = domicilioActual;
		this.sexo = "F";
		this.telefono = telefono;
		this.cursosInscriptos= new ArrayList<Curso>();

	}


	public int getNroDocumento() {
		return nroDocumento;
	}


	public void setNroDocumento(int nroDocumento) {
		this.nroDocumento = nroDocumento;
	}


	public String getTipoDeDocumento() {
		return tipoDeDocumento;
	}


	public void setTipoDeDocumento(String tipoDeDocumento) {
		this.tipoDeDocumento = tipoDeDocumento;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getDomicilioActual() {
		return domicilioActual;
	}


	public void setDomicilioActual(String domicilioActual) {
		this.domicilioActual = domicilioActual;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public ArrayList<Curso> getCursosInscriptos() {
		return cursosInscriptos;
	}


	public void setCursosInscriptos(ArrayList<Curso> cursosInscriptos) {
		this.cursosInscriptos = cursosInscriptos;
	}


	
	
	
	

}
