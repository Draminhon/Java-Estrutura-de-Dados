package com.murilo.pilha;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
	
		
		Pilha novaPilha = new Pilha();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite -a para utilizar o push\n-s para exibir a pilha e encerrar o programa\ne -p para utilizar o pop");
		
		while(true) {
			String escolha = scan.next();	
			
				if(escolha.equals("-a")) {
					novaPilha.push(new No(scan.nextInt()));
				}else if(escolha.equals("-s")) {
					System.out.println(novaPilha);
				}else if(escolha.equals("-p")) {
					System.out.println("O elemento removido foi: " + novaPilha.pop());
				}
			
			
		}

		
	}

}
