package com.murilo.filaDuplamenteEncadeada;


public class DupQueue <T>{

	private Node <T> top, base;
    private int count;
	public DupQueue() {
		
		this.top = null;
		this.base = null;
		this.count = 0;
	}
	
	public void addTop(T obj) {
		Node<T> newObj = new Node<>(obj);
		count++;
		
		if(count == 1) {
			this.base = newObj;
	 		this.top = newObj;
	 		this.base.setNextNode(null);
		}
		
		Node<T> aux = this.top;
		this.top = newObj;
		aux.setNextNode(newObj);
		newObj.setPreviousNode(aux);
	}
	
	public Node<T> getNode(int index){
		
		Node<T> aux = this.base;
	
			for(int i = 0; i<index-1; i++) {
				aux = aux.getNextNode();
			}
		
		return aux;
	}
	
	public void addInIndex(T obj, int index) {
		Node<T> newObj = new Node<>(obj);
		count++;

		if(index==0) {
			System.out.println("Invalid index! Please choose a valid one");
			
		}
		
		if(index == 1) {
			Node<T> aux = this.base;
			this.base = newObj;
			newObj.setPreviousNode(null);
			newObj.setNextNode(aux);
			aux.setPreviousNode(newObj);
			
		}else if(index >= count){
			Node<T> aux4 = this.top;
			this.top = newObj;
			newObj.setPreviousNode(aux4);
			aux4.setNextNode(newObj);
			
		}else {
		Node<T> aux2 = getNode(index);
		aux2.getPreviousNode().setNextNode(newObj);
		newObj.setPreviousNode(aux2.getPreviousNode());
		newObj.setNextNode(aux2);
		aux2.setPreviousNode(newObj);
		}
	}
	
	public Node<T> remove(int position){
		
		Node<T> removedNode = null;
		Node<T> aux = base;
		count--;
		if(position == 1) {
			removedNode = base;
		    base = base.getNextNode();
		    
		}else if(position>=count) {
			removedNode = this.top;
			this.top = removedNode.getPreviousNode();
			this.top.setNextNode(null);
		}else {
			aux = getNode(position);
			removedNode = aux;
			aux.getPreviousNode().setNextNode(aux.getNextNode());
			aux.getNextNode().setPreviousNode(aux.getPreviousNode());
		}
		
		return removedNode;
	}
	
	public void emptyQueue() {
		Node<T> aux = base;
		while(base!=null) {
			aux = remove(1);
		}
		
		
	}
	
	
	
	public String toString() {
		String stringAux = "-----------------------------------------------------------------\n";
		stringAux += "                           Fila\n";
		stringAux += "-----------------------------------------------------------------\n";
		
		Node<T> aux = base;
	
		int i = 0;
		  for(int j = 0; j<count; j++){
			
			if(aux!=null) {
				i++;
				stringAux += "posicao " + i + " = " + aux.getValue() + " | ";
				if(i%4 == 0) {
					stringAux += "\n";
				}
				aux = aux.getNextNode();
			}
		}
		stringAux += "\n=================================================================\n";
		if(count == 0) {
			stringAux = "Fila vazia!";
		}
		
		return stringAux;
	}
}
