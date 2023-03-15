package com.murilo.pilha;

public class No {

	private int dado;
	private No proximo = null; //é a referencia para o proximo nó, no caso da pilha,
	//como o proximo do primeiro elemento da pilha é nulo, então setamos como null.
	public int getDado() {
		return dado;
	}
	public void setDado(int dado) {
		this.dado = dado;
	}
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	public No(int dado) {
		super();
		this.dado = dado;
	}
	
	public No() {
		
	}
	@Override
	public String toString() {
		return "No [dado=" + dado + "]";
	}

	
	
}
