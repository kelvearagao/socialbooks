package com.kelvearagao.socialbooks.services.exceptions;

// exceção não checada
public class AutorExistenteException extends RuntimeException {
	
	private static final long serialVersionUID = 4521221669553121346L;

	public AutorExistenteException(String mensagem) {
		super(mensagem);
	}
	
	public AutorExistenteException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
	
}
