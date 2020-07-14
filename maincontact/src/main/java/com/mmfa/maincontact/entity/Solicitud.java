package com.mmfa.maincontact.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Solicitud")
public class Solicitud {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String telefono;
	private String correo;
	private Date fecha;
	private String text;
	
	@ManyToOne
	@JoinColumn(name="idAsociado")
	private Asociado asociado;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Date getFacha() {
		return fecha;
	}

	public void setFacha(Date facha) {
		this.fecha = facha;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Asociado getAsociado() {
		return asociado;
	}

	public void setAsociado(Asociado asociado) {
		this.asociado = asociado;
	}

	@Override
	public String toString() {
		return "Solicitud [id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + ", correo=" + correo
				+ ", facha=" + fecha + ", text=" + text + ", asociado=" + asociado + "]";
	}

	
	
}
