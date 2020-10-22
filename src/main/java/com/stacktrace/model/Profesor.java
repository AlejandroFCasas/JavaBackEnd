package com.stacktrace.model;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.PrimaryKeyJoinColumn;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
@Table(name="Profesor")
public class Profesor {
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

	@Column(name="cursosDictados", length = 100)
	private ArrayList <String> cursosDictados;
	
	
	@Column(name="capacitaciones", length = 100)
	private ArrayList <String> capacitaciones;
	
	@Column(name="titulos", length = 100)
	private ArrayList <String> titulos;
	
	public Profesor(){
		
	}
//int nroDocumento, String tipoDeDocumento,String nombre,String apellido,Date fechaNacimiento, String domicilioActual,String sexo,Int telefono 
// nroDocumento,  tipoDeDocumento, nombre, apellido, fechaNacimiento,  domicilioActual, sexo, telefono 
	
	public Profesor(int nroDocumento, String tipoDeDocumento,String nombre,
			String apellido,String fechaNacimiento, String domicilioActual,
			String sexo,int telefono ){
		this.nroDocumento = nroDocumento;
		this.tipoDeDocumento = tipoDeDocumento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.domicilioActual = domicilioActual;
		this.sexo = sexo;
		this.telefono = telefono;
		this.cursosDictados= new ArrayList<String>();
		this.capacitaciones= new ArrayList<String>();
		this.titulos= new ArrayList<String>();
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

	public ArrayList<String> getCursosInscriptos() {
		return cursosDictados;
	}

	public void setCursosInscriptos(ArrayList<String> cursosInscriptos) {
		this.cursosDictados = cursosInscriptos;
	}

	public ArrayList<String> getCursosDictados() {
		return cursosDictados;
	}

	public void setCursosDictados(ArrayList<String> cursosDictados) {
		this.cursosDictados = cursosDictados;
	}

	public ArrayList<String> getCapacitaciones() {
		return capacitaciones;
	}

	public void setCapacitaciones(ArrayList<String> capacitaciones) {
		this.capacitaciones = capacitaciones;
	}

	public ArrayList<String> getTitulos() {
		return titulos;
	}

	public void setTitulos(ArrayList<String> titulos) {
		this.titulos = titulos;
	}
	
	
}
