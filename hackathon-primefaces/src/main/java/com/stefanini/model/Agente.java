package com.stefanini.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the agente database table.
 * 
 */
@Entity
@NamedQuery(name="Agente.findAll", query="SELECT a FROM Agente a")
public class Agente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idAgente;

	@Temporal(TemporalType.DATE)
	private Date dtContratacao;

	private String nome;

	private int tempoServico;

	public Agente() {
	}

	public int getIdAgente() {
		return this.idAgente;
	}

	public void setIdAgente(int idAgente) {
		this.idAgente = idAgente;
	}

	public Date getDtContratacao() {
		return this.dtContratacao;
	}

	public void setDtContratacao(Date dtContratacao) {
		this.dtContratacao = dtContratacao;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTempoServico() {
		return this.tempoServico;
	}

	public void setTempoServico(int tempoServico) {
		this.tempoServico = tempoServico;
	}

}