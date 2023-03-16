package com.murilo.fila;

public class Fila {
	
	private No base;
	private No topo;
	private int quantidade = 0;
	No auxiliar;
	
	Fila(){
		this.base = null;
		this.topo = null;
	}
	
	public void enqueue(Object obj) {
		No novo = new No(obj);
		quantidade++;
		if(quantidade==1) {
			base = novo;
			topo = novo;
			topo.setProximo(null);
		}else if(quantidade>1) {
		  No aux = topo;
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
	
	public No dequeue() {
		
		if(!isEmpty()) {
			No noPoped = base;
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
		
		No aux = base;
		
		while(true) {
			
			if(aux!=null) {
				stringAux += "Dado = " + aux.getValor() + "\n";
				aux = aux.getProximo();
			}else {
				break;
			}
		}
		stringAux += "===================";
		if(quantidade == 0) {
			stringAux = "Fila vazia!";
		}
		return stringAux;
		
	}
	

}
