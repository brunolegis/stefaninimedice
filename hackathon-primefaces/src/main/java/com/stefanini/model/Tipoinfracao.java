package com.stefanini.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tipoinfracao database table.
 * 
 */
@Entity
@NamedQuery(name="Tipoinfracao.findAll", query="SELECT t FROM Tipoinfracao t")
public class Tipoinfracao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idTipoInfracao;

	private String descricaoTipoInfracao;

	private double valor;

	public Tipoinfracao() {
	}

	public int getIdTipoInfracao() {
		return this.idTipoInfracao;
	}

	public void setIdTipoInfracao(int idTipoInfracao) {
		this.idTipoInfracao = idTipoInfracao;
	}

	public String getDescricaoTipoInfracao() {
		return this.descricaoTipoInfracao;
	}

	public void setDescricaoTipoInfracao(String descricaoTipoInfracao) {
		this.descricaoTipoInfracao = descricaoTipoInfracao;
	}

	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}