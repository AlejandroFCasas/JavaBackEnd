package com.stacktrace.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name="Alumno")
public class Alumno implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="nroDocumento", length = 50)
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

	
	@ManyToMany(cascade=CascadeType.ALL)
	private List <Curso> cursos;	
	
	
	public void addCurso(Optional<Curso> curso) {
		if (this.cursos == null) {
			this.cursos=new ArrayList<>();
		}
		Curso temp = new Curso(curso.get().getIdCurso(),curso.get().getNombre(),curso.get().getDuracionHoras(),curso.get().getDescripcion(),curso.get().getNotaAprobacion());
		//public Curso (int idCurso, String nombreCurso, int duracionHoras, String descripcion, int notaAprobacion) {
		this.cursos.add(temp);
		
	}
	
	public Alumno() {
		this.cursos=new ArrayList<>();
	}


	public Alumno(int nroDocumento, String tipoDeDocumento,String nombre,
			String apellido,String fechaNacimiento, String domicilioActual,
			String sexo,int telefono){

		this.nroDocumento = nroDocumento;
		this.tipoDeDocumento = tipoDeDocumento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.domicilioActual = domicilioActual;
		this.sexo = "F";
		this.telefono = telefono;
		this.cursos=new ArrayList<>();
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


	public List<Curso> getCursos() {
		return cursos;
	}


	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	
	public void agregarCurso(Curso curso) {
		this.cursos.add(curso);
	}






	
	
	
	

}
