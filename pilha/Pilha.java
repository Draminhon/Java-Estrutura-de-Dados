package com.murilo.pilha;

public class Pilha {

	private No topoPilha; //topo da pilha, por onde os elementos entram
	
	public Pilha() {
		
		this.topoPilha = null; // nulo pois quando instanciamos o objeto Pilha, ela está vazia, portanto o topo aponta para nulo.
		}
	
	public boolean isEmpty(){
		
		return topoPilha == null ? true : false;
	}
	
	
	public No top() {
		return topoPilha;
	}
	
	public void push(No novoNo){
		 No aux = topoPilha; //guarda a referencia do topo
		 topoPilha = novoNo; //faz o topo apontar para o novo elemento
		 topoPilha.setProximo(aux); //faz o proximo do elemento apontar para a antiga referencia do topo
	}
	
	public No pop() {
		if(!this.isEmpty()) {
			No noPoped = topoPilha;
			topoPilha = topoPilha.getProximo();
			return noPoped;
			
		}
		return null;
	}
	
	@Override
	
	public String toString() {
		
		String stringAux = "-------------------\n";
		stringAux += "       Pilha\n";
		stringAux += "-------------------\n";
		
		No aux = topoPilha;
		
		while(true) {
			
			if(aux!=null) {
				stringAux += "Dado = " + aux.getDado() + "\n";
				aux = aux.getProximo();
			}else {
				break;
			}
		}
		stringAux += "===================";
		return stringAux;
		
		
	}
	
	
}
