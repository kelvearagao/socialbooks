package com.kelvearagao.socialbooks.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kelvearagao.socialbooks.domain.Autor;
import com.kelvearagao.socialbooks.repository.AutoresRepository;
import com.kelvearagao.socialbooks.services.exceptions.AutorExistenteException;
import com.kelvearagao.socialbooks.services.exceptions.AutorNaoEncontradoException;

@Service
public class AutoresService {
	
	@Autowired
	private AutoresRepository autoresRepository;
	
	/**
	 * Retorna uma lista de autores.
	 * 
	 * @return
	 */
	public List<Autor> listar() {
		return autoresRepository.findAll();
	}
	
	/**
	 * Salva um autor.
	 * 
	 * @param autor
	 * @return
	 */
	public Autor salvar(Autor autor) {
		if(autor.getId() != null) {
			Autor a = autoresRepository.findOne(autor.getId());
			
			if(a != null) {
				throw new AutorExistenteException("O autor já existe."); 
			}
		}
		
		return autoresRepository.save(autor);
	}
	
	/**
	 * Busca um autor.
	 * 
	 * @param id
	 * @return
	 */
	public Autor buscar(Long id) {
		Autor autor = autoresRepository.findOne(id);
		
		if(autor == null) {
			throw new AutorNaoEncontradoException("O autor não pode ser encontrado.");
		}
		
		return autor;
	}
	
}
