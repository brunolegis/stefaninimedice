package com.stefanini.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the telefones database table.
 * 
 */
@Entity
@Table(name="telefones")
@NamedQuery(name="Telefone.findAll", query="SELECT t FROM Telefone t")
public class Telefone implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TelefonePK id;

	private int idTipoTelefone;

	public Telefone() {
	}

	public TelefonePK getId() {
		return this.id;
	}

	public void setId(TelefonePK id) {
		this.id = id;
	}

	public int getIdTipoTelefone() {
		return this.idTipoTelefone;
	}

	public void setIdTipoTelefone(int idTipoTelefone) {
		this.idTipoTelefone = idTipoTelefone;
	}

}