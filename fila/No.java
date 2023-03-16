package com.murilo.fila;

public class No {

	private Object valor;
	private No proximo = null;
	public No(Object valor) {
		super();
		this.valor = valor;
	}
	public Object getValor() {
		return valor;
	}
	public void setValor(Object valor) {
		this.valor = valor;
	}
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	@Override
	public String toString() {
		return "valor retirado = " + valor;
	}
	
	
}
