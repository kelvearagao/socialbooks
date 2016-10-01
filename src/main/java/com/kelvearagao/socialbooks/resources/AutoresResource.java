package com.kelvearagao.socialbooks.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kelvearagao.socialbooks.domain.Autor;
import com.kelvearagao.socialbooks.services.AutoresService;

@RestController
@RequestMapping("/autores")
public class AutoresResource {

	@Autowired
	private AutoresService autoresService;
	
	/**
	 * Retorna uma lista de autores.
	 * 
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Autor>> listar() {
		return ResponseEntity.status(HttpStatus.OK).body(autoresService.listar());
	}
	
}
