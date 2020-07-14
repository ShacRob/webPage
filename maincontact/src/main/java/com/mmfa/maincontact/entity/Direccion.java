package com.mmfa.maincontact.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Direccion")
public class Direccion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	@JoinColumn(name="idAsociado")
	private Asociado idAsociado;
	private Integer tipo;
	private String pais;
	private String estado;
	private String municipio;
	private String colonia;
	private String calle;
	private String numExt;
	private String numInt;
	private String cp;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Asociado getIdAsociado() {
		return idAsociado;
	}
	public void setIdAsociado(Asociado idAsociado) {
		this.idAsociado = idAsociado;
	}
	public Integer getTipo() {
		return tipo;
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getColonia() {
		return colonia;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getNumExt() {
		return numExt;
	}
	public void setNumExt(String numExt) {
		this.numExt = numExt;
	}
	public String getNumInt() {
		return numInt;
	}
	public void setNumInt(String numInt) {
		this.numInt = numInt;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	@Override
	public String toString() {
		return "Direccion [id=" + id + ", idAsociado=" + idAsociado + ", tipo=" + tipo + ", pais=" + pais + ", estado="
				+ estado + ", municipio=" + municipio + ", colonia=" + colonia + ", calle=" + calle + ", numExt="
				+ numExt + ", numInt=" + numInt + ", cp=" + cp + "]";
	}
	
	
	

}
