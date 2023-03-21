package com.murilo.filaDuplamenteEncadeada;

import java.util.Scanner;



public class Teste {

	public static void main(String[] args) {
     DupQueue<String> queue = new DupQueue<>();
		
		Scanner scan = new Scanner(System.in);
		
System.out.println("-----------------------------------------\n"
		+ "Digite\n"
		+ "-a para adicionar no topo da lista\n"
		+ "-s para exibir a lista e encerrar o programa\n"
		+ "-d para adicionar um elemento em uma posição específica\n"
		+ "-f para excluir um elemento em uma posição especifica (passe o index como 1 para remover da base\n"
		+ "-g para esvaziar toda a lista");
		
		while(true) {
			String escolha = scan.next();	
			
				if(escolha.equalsIgnoreCase("-a")) {
					
					queue.addTop(scan.next());
					
				}else if(escolha.equalsIgnoreCase("-s")) {
					
					System.out.println(queue.toString());
					break;
				}else if(escolha.equalsIgnoreCase("-d")) {
					queue.addInIndex(scan.next(), scan.nextInt());
					
				}else if(escolha.equalsIgnoreCase("-f")) {
					
					queue.remove(scan.nextInt());
					
				}else if(escolha.equalsIgnoreCase("-g")) {
					
					queue.emptyQueue();
				}

				scan.close();
	}

}
}
