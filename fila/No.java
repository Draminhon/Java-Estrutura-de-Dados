package com.murilo.fila;

public class No {

	private int valor;
	private No proximo = null;
	public No(int valor) {
		super();
		this.valor = valor;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
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
		return "No [valor=" + valor + "]";
	}
	
	
}
