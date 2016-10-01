package com.kelvearagao.socialbooks.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kelvearagao.socialbooks.domain.Autor;
import com.kelvearagao.socialbooks.repository.AutoresRepository;

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
	
}
