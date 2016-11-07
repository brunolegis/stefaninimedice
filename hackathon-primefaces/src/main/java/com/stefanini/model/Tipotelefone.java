package com.stefanini.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tipotelefone database table.
 * 
 */
@Entity
@NamedQuery(name="Tipotelefone.findAll", query="SELECT t FROM Tipotelefone t")
public class Tipotelefone implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idTipoTelefone;

	private String descricaoTipoTelefone;

	public Tipotelefone() {
	}

	public int getIdTipoTelefone() {
		return this.idTipoTelefone;
	}

	public void setIdTipoTelefone(int idTipoTelefone) {
		this.idTipoTelefone = idTipoTelefone;
	}

	public String getDescricaoTipoTelefone() {
		return this.descricaoTipoTelefone;
	}

	public void setDescricaoTipoTelefone(String descricaoTipoTelefone) {
		this.descricaoTipoTelefone = descricaoTipoTelefone;
	}

}