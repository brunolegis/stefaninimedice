package com.stefanini.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the veiculos database table.
 * 
 */
@Entity
@Table(name="veiculos")
@NamedQuery(name="Veiculo.findAll", query="SELECT v FROM Veiculo v")
public class Veiculo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String placa;

	private int cpfProprietario;

	private int idModelo;

	private String uf;

	public Veiculo() {
	}

	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getCpfProprietario() {
		return this.cpfProprietario;
	}

	public void setCpfProprietario(int cpfProprietario) {
		this.cpfProprietario = cpfProprietario;
	}

	public int getIdModelo() {
		return this.idModelo;
	}

	public void setIdModelo(int idModelo) {
		this.idModelo = idModelo;
	}

	public String getUf() {
		return this.uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}