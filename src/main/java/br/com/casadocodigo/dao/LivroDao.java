package br.com.casadocodigo.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.casadocodigo.models.Livro;

public class LivroDao {

	
//	A anotação @PersistenceContext injeta automaticamente uma instância do EntityManager
	@PersistenceContext
	private EntityManager manager;
	
	public void salvar(Livro livro) {
		manager.persist(livro);
	}
	
	
}
