package com.stefanini.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the telefones database table.
 * 
 */
@Embeddable
public class TelefonePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int numero;

	private int ddd;

	private int cpfProprietario;

	public TelefonePK() {
	}
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getDdd() {
		return this.ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	public int getCpfProprietario() {
		return this.cpfProprietario;
	}
	public void setCpfProprietario(int cpfProprietario) {
		this.cpfProprietario = cpfProprietario;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TelefonePK)) {
			return false;
		}
		TelefonePK castOther = (TelefonePK)other;
		return 
			(this.numero == castOther.numero)
			&& (this.ddd == castOther.ddd)
			&& (this.cpfProprietario == castOther.cpfProprietario);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.numero;
		hash = hash * prime + this.ddd;
		hash = hash * prime + this.cpfProprietario;
		
		return hash;
	}
}