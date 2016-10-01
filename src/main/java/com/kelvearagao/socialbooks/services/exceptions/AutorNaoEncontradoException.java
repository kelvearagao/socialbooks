package com.kelvearagao.socialbooks.services.exceptions;

// exceção não checada
public class AutorNaoEncontradoException extends RuntimeException {
	
	private static final long serialVersionUID = 4521221669553121346L;

	public AutorNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
	
	public AutorNaoEncontradoException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
	
}
