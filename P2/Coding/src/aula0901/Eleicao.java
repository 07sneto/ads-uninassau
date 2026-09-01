package aula0901;

import java.util.Scanner;

public class Eleicao {

	public static void main(String[] args) {
		//Biblioteca para leitura de dados
		Scanner scanner = new Scanner(System.in);
		
		//Entrada
		System.out.print("Idade: ");
		int idade = scanner.nextInt();
		
		//Processamento
		boolean votoFacultativo = ((idade >= 16) && (idade < 18)) || (idade >= 70);
		
		//Saída
		System.out.println("Voto facultativo? "+votoFacultativo);		
		
		scanner.close();
	}
	
}
