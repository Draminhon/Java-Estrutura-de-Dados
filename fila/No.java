package com.murilo.fila;

public class No<T>{

	private T valor;
	private No<T> proximo = null;
	public No(T valor) {
		super();
		this.valor = valor;
	}
	public Object getValor() {
		return valor;
	}
	public void setValor(T valor) {
		this.valor = valor;
	}
	public No<T> getProximo() {
		return proximo;
	}
	public void setProximo(No<T> proximo) {
		this.proximo = proximo;
	}
	@Override
	public String toString() {
		return "valor retirado = " + valor;
	}
	
	
}
