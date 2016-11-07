package com.stefanini.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the infracoes database table.
 * 
 */
@Entity
@Table(name="infracoes")
@NamedQuery(name="Infracoe.findAll", query="SELECT i FROM Infracoe i")
public class Infracoe implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idInfracao;

	private int idAgente;

	private int idLocalInfracao;

	private int idTipoInfracao;

	private String placa;

	private int velocidade;

	public Infracoe() {
	}

	public int getIdInfracao() {
		return this.idInfracao;
	}

	public void setIdInfracao(int idInfracao) {
		this.idInfracao = idInfracao;
	}

	public int getIdAgente() {
		return this.idAgente;
	}

	public void setIdAgente(int idAgente) {
		this.idAgente = idAgente;
	}

	public int getIdLocalInfracao() {
		return this.idLocalInfracao;
	}

	public void setIdLocalInfracao(int idLocalInfracao) {
		this.idLocalInfracao = idLocalInfracao;
	}

	public int getIdTipoInfracao() {
		return this.idTipoInfracao;
	}

	public void setIdTipoInfracao(int idTipoInfracao) {
		this.idTipoInfracao = idTipoInfracao;
	}

	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getVelocidade() {
		return this.velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

}