package com.murilo.estruturadedados;

public class Testando {

	public static void main(String[] args) {
		
		
		No_teste<String> no1 = new No_teste<>("conteúdo do No1");
		No_teste<String> no2 = new No_teste<>("conteúdo do No2");
		No_teste<String> no3 = new No_teste<>("conteúdo do No3");
		No_teste<String> no4 = new No_teste<>("conteúdo do No4");
		No_teste<String> no5 = new No_teste<>("conteúdo do No5");
		
		no1.setProximo(no2);
		no2.setProximo(no3);
		no3.setProximo(no4);
		no4.setProximo(no5);
		
		System.out.println(no1); //exibe o valor do primeiro nó
		System.out.println(no1.getProximo()); //exibe o valor do segundo nó
		System.out.println(no1.getProximo().getProximo()); //exibe o valor do terceiro nó
		System.out.println(no1.getProximo().getProximo().getProximo()); //exibe o valor do quarto nó
		System.out.println(no1.getProximo().getProximo().getProximo().getProximo());
		

	}

}