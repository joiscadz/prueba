package com.openshift.prueba.dao;

import java.io.Serializable;

public class PruebaDao implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	private Long id;
	private String marca;
	private String color;
	private String modelo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public PruebaDao(Long id, String marca, String color, String modelo) {
		super();
		this.id = id;
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
	}

	public PruebaDao() {
		super();
		// TODO Auto-generated constructor stub
	}

}
