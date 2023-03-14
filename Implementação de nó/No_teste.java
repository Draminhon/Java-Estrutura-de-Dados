package com.murilo.estruturadedados;

public class No_teste <T>{

	private T conteudo;
	private No_teste<T> proximo;
	
	No_teste(T conteudo){
		this.conteudo = conteudo;
		this.proximo = null;
	}

	@Override
	public String toString() {
		return "No_teste [conteudo=" + conteudo + "]";
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public No_teste<T> getProximo() {
		return proximo;
	}

	public void setProximo(No_teste<T> proximo) {
		this.proximo = proximo;
	}
	
	
}
