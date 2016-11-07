package com.stefanini.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the modelo database table.
 * 
 */
@Entity
@NamedQuery(name="Modelo.findAll", query="SELECT m FROM Modelo m")
public class Modelo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idModelo;

	private String descricaoModelo;

	private int idCategoria;

	public Modelo() {
	}

	public int getIdModelo() {
		return this.idModelo;
	}

	public void setIdModelo(int idModelo) {
		this.idModelo = idModelo;
	}

	public String getDescricaoModelo() {
		return this.descricaoModelo;
	}

	public void setDescricaoModelo(String descricaoModelo) {
		this.descricaoModelo = descricaoModelo;
	}

	public int getIdCategoria() {
		return this.idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

}