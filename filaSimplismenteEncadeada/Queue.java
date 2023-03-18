package com.murilo.filaSimplismenteEncadeada;


public class Queue<T>{
	
	private Node<T> base;
	private Node<T> top;
	private int quantity;
	
	public Queue() {
		this.base = null;
		this.top = null;
		this.quantity = 0;
		}
	
	
	
	public Node<T> getNode(int position) {
		Node<T> aux = this.base;
	
		
		position = position-1;
		
		
		
			for(int i = 0; i<position-1; i++) {
				aux = aux.getNextNode();
			}
		
		return aux;
	}
	
	public void addPosition(T obj, int position) {
		Node<T> newObj = new Node<>(obj);
		quantity++;
		if(position == 1) {
			Node<T> aux = this.base;
			this.base = newObj;
			newObj.setNextNode(aux);
		}else {
		
		Node<T> aux2 = getNode(position);
		newObj.setNextNode(aux2.getNextNode());	
		aux2.setNextNode(newObj);
		}
	}
	
	public void add(T obj) {
		
		Node<T> newObj = new Node<>(obj);
		 quantity++;
		 
		 	if(quantity==1) {
		 		this.base = newObj;
		 		this.top = newObj;
		 		this.base.setNextNode(null);
		 	}else if(quantity>1) {
		 		
		
		 		
		 		Node<T> aux3 = this.top;
		 		this.top = newObj;
		 		aux3.setNextNode(newObj);
		 		
		 	}
	
		
	}
	
	public Node<T> remove(int position){
		
		Node<T> removedNode = null;
		Node<T> aux = base;
		
		if(position == 1) {
			removedNode = base;
		    base = base.getNextNode();
		    quantity--;
		}else {
			aux = getNode(position);
			removedNode = aux.getNextNode();
			aux.setNextNode(aux.getNextNode().getNextNode());
			quantity--;
		}
		
		return removedNode;
	}
	
	public void emptyQueue() {
		Node<T> aux = base;
		while(base!=null) {
			aux = remove(1);
		}
		
		
	}
	
	


	@Override
	public String toString() {
		String stringAux = "-----------------------------------------------------------------\n";
		stringAux += "                           Fila\n";
		stringAux += "-----------------------------------------------------------------\n";
		
		Node<T> aux = base;
	
		int i = 0;
		while(true) {
			
			if(aux!=null) {
				i++;
				stringAux += "posicao " + i + " = " + aux.getValue() + " | ";
				if(i%4 == 0) {
					stringAux += "\n";
				}
				aux = aux.getNextNode();
			}else {
				break;
			}
		}
		stringAux += "\n=================================================================\n";
		if(quantity == 0) {
			stringAux = "\nFila vazia!";
		}
		
		return stringAux;
		
	}
		
	}
	
	
	
	
	
	


