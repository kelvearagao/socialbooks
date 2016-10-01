package com.kelvearagao.socialbooks.services.exceptions;

// exceção não checada
public class LivroNaoEncontradoException extends RuntimeException {
	
	private static final long serialVersionUID = 4521221669553121346L;

	public LivroNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
	
	public LivroNaoEncontradoException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
	
}
