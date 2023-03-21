package com.murilo.filaDuplamenteEncadeada;

public class Node<T>{

	private T value;
	private Node<T> nextNode = null;
	private Node<T> previousNode = null;
	
	public Node(T valor) {
		this.value = valor;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Node<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}

	public Node<T> getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(Node<T> previousNode) {
		this.previousNode = previousNode;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + "]";
	}

	
	


	
	
}
