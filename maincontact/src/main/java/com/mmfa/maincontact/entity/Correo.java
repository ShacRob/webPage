package com.mmfa.maincontact.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Correos")
public class Correo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer tipo;
	private String correo;
	@ManyToOne
	@JoinColumn(name="idAsociado")
	private Asociado asociado;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTipo() {
		return tipo;
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public Asociado getAsociado() {
		return asociado;
	}
	public void setAsociado(Asociado asociado) {
		this.asociado = asociado;
	}
	@Override
	public String toString() {
		return "Correo [id=" + id + ", tipo=" + tipo + ", correo=" + correo + ", asociado=" + asociado + "]";
	}
	
	
}
