package com.stefanini.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the proprietario database table.
 * 
 */
@Entity
@NamedQuery(name="Proprietario.findAll", query="SELECT p FROM Proprietario p")
public class Proprietario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int cpfProprietario;

	private String bairro;

	private String cidade;

	@Temporal(TemporalType.DATE)
	private Date dtNascimento;

	private String endereco;

	private String nome;

	private String sexo;

	private String uf;

	public Proprietario() {
	}

	public int getCpfProprietario() {
		return this.cpfProprietario;
	}

	public void setCpfProprietario(int cpfProprietario) {
		this.cpfProprietario = cpfProprietario;
	}

	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Date getDtNascimento() {
		return this.dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getUf() {
		return this.uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}