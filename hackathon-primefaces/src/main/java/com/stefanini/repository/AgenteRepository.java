package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Agente;
import com.stefanini.model.Denuncia;

public class AgenteRepository {

	@Inject
	private EntityManager manager;
	
	public void incluir(Agente agente) {
		this.manager.persist(agente);
	}

	public void altera(Agente agente) {
		this.manager.merge(agente);
	}

	public Denuncia busca(Integer id) {
		return this.manager.find(Denuncia.class, id);
	}

	public List<Agente> lista() {
		return this.manager.createQuery("select c from denuncia c", Agente.class)
				.getResultList();
	}
}
