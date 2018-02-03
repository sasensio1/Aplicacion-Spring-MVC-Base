package com.springBasicProject.model;

import java.util.Date;

public class Academia {
	
	private String id;
	private String nombre;
	private Integer prestigio;
	private String ciudad;
	private Boolean examenes;
	private Date fecha_fundacion;
	private Integer numero_alumnos;
	
	
	
	public Academia() {
		super();
	}

	//Constructor
	public Academia(String id, String nombre, Integer prestigio, String ciudad, Boolean examenes, Date fecha_fundacion,
			Integer numero_alumnos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.prestigio = prestigio;
		this.ciudad = ciudad;
		this.examenes = examenes;
		this.fecha_fundacion = fecha_fundacion;
		this.numero_alumnos = numero_alumnos;
	}

	//Getters and Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPrestigio() {
		return prestigio;
	}

	public void setPrestigio(Integer prestigio) {
		this.prestigio = prestigio;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Boolean getExamenes() {
		return examenes;
	}

	public void setExamenes(Boolean examenes) {
		this.examenes = examenes;
	}

	public Date getFecha_fundacion() {
		return fecha_fundacion;
	}

	public void setFecha_fundacion(Date fecha_fundacion) {
		this.fecha_fundacion = fecha_fundacion;
	}

	public Integer getNumero_alumnos() {
		return numero_alumnos;
	}

	public void setNumero_alumnos(Integer numero_alumnos) {
		this.numero_alumnos = numero_alumnos;
	}
	
	
	

	






}
