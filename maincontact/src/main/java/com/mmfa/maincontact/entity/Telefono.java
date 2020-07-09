package com.mmfa.maincontact.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Telefonos")
public class Telefono {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer tipo;
	private Integer celular;
	private String telefono;
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
	public Integer getCelular() {
		return celular;
	}
	public void setCelular(Integer celular) {
		this.celular = celular;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Asociado getAsociado() {
		return asociado;
	}
	public void setAsociado(Asociado asociado) {
		this.asociado = asociado;
	}
	@Override
	public String toString() {
		return "Telefono [id=" + id + ", tipo=" + tipo + ", celular=" + celular + ", telefono=" + telefono
				+ ", asociado=" + asociado + "]";
	}
	
	
}
