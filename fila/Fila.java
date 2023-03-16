package com.murilo.fila;

public class Fila<T>{
	
	private No<T> base;
	private No<T> topo;
	private int quantidade = 0;
	
	Fila(){
		this.base = null;
		this.topo = null;
	}
	
	public void enqueue(T obj) {
		No<T> novo = new No<>(obj);
		quantidade++;
		if(quantidade==1) {
			base = novo;
			topo = novo;
			topo.setProximo(null);
		}else if(quantidade>1) {
		  No<T> aux = topo;
		  topo = novo;
			aux.setProximo(novo);
			
		}
	}
	
	public int getQuantidade() {
		return this.quantidade;
	}
	
	public boolean isEmpty() {
		return topo == null ? true : false;
	}
	
	public No<T> dequeue() {
		
		if(!isEmpty()) {
			No<T> noPoped = base;
			base = base.getProximo();
			return noPoped;
		}
		return null;
	}

	@Override
	public String toString() {

		String stringAux = "-------------------\n";
		stringAux += "       Fila\n";
		stringAux += "-------------------\n";
		
		No<T> aux = base;
		int i = 0;
		while(true) {
			
			if(aux!=null) {
				i++;
				stringAux += "posicao " + i + " = " + aux.getValor() + " | ";
				aux = aux.getProximo();
			}else {
				break;
			}
		}
		stringAux += "\n===================";
		if(quantidade == 0) {
			stringAux = "Fila vazia!";
		}
		return stringAux;
		
	}
	

}
