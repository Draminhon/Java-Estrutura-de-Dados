package com.murilo.fila;

import java.util.Scanner;

public class Teste{

	public static void main(String[] args) {
		
		

		Fila novaFila = new Fila();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite -a para utilizar o push\n-s para exibir a fila e encerrar o programa\ne -p para utilizar o pop");
		
		while(true) {
			String escolha = scan.next();	
			
				if(escolha.equals("-a")) {
					 novaFila.enqueue(scan.nextInt());
				}else if(escolha.equals("-s")) {
					System.out.println(novaFila.toString());
					break;
				}else if(escolha.equals("-p")) {
					System.out.println(novaFila.dequeue());
				}
	
			
		}
        scan.close();

	}

}
