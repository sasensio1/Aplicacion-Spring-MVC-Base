package com.springBasicProject.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.springBasicProject.vo.ObjectVO;
import com.springBasicProject.model.Academia;

import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "public.academia")
public class AcademiaVO extends ObjectVO implements Serializable {	
	
	private static final long serialVersionUID = 1L;

	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "prestigio")
	private Integer prestigio;
	
	@Column(name = "ciudad")
	private String ciudad;
	
	@Column(name = "examenes")
	private Boolean examenes;
	
	@Column(name = "fecha_fundacion")
	private Date fecha_fundacion;
	
	@Column(name = "numero_alumnos")
	private Integer numero_alumnos;
	
	
	//Constructor
	
	public AcademiaVO() {
		super();
	}	
	public AcademiaVO(String id, String nombre, Integer prestigio, String ciudad, Boolean examenes,
			Date fecha_fundacion, Integer numero_alumnos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.prestigio = prestigio;
		this.ciudad = ciudad;
		this.examenes = examenes;
		this.fecha_fundacion = fecha_fundacion;
		this.numero_alumnos = numero_alumnos;
	}
	


	//Getters y Setters
	
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
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override 
	public Object instantiateTargetLogic() {
		Academia academia = new Academia();
		return academia;
	}

}
