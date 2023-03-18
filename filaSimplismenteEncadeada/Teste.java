package com.murilo.filaSimplismenteEncadeada;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Queue<String> queue = new Queue<>();
		
		Scanner scan = new Scanner(System.in);
		
System.out.println("-----------------------------------------\n"
		+ "Digite\n"
		+ "-a para adicionar no topo da lista\n"
		+ "-s para exibir a fila e encerrar o programa\n"
		+ "-p para inserir em qualquer posição da lista\n"
		+ "-z para retirar de uma determinada posição\n"
		+ "-e para esvaziar a fila\n"
		+ "----------------------------------------");
		
		while(true) {
			String escolha = scan.next();	
			
				if(escolha.equalsIgnoreCase("-a")) {
					
					queue.add(scan.next());
					
				}else if(escolha.equalsIgnoreCase("-s")) {
					
					System.out.println(queue.toString());
					break;
				
				}else if(escolha.equalsIgnoreCase("-p")) {
					
					queue.addPosition(scan.next(), scan.nextInt());
					
				}else if(escolha.equalsIgnoreCase("-z")) {
					
					System.out.println(queue.remove(scan.nextInt()));
					
				}else if(escolha.equalsIgnoreCase("-e")) {
					
					queue.emptyQueue();
					
				}
				
		}
		scan.close();
	}


}
