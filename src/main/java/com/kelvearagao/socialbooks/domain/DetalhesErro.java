package com.kelvearagao.socialbooks.domain;

public class DetalhesErro {
	
	private String titulo;
	private Long status;
	private Long timestamp;
	private String mensagemDesenvovedor;
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public Long getStatus() {
		return status;
	}
	
	public void setStatus(Long status) {
		this.status = status;
	}
	
	public Long getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	
	public String getMensagemDesenvovedor() {
		return mensagemDesenvovedor;
	}
	
	public void setMensagemDesenvovedor(String mensagemDesenvovedor) {
		this.mensagemDesenvovedor = mensagemDesenvovedor;
	}
	
}
