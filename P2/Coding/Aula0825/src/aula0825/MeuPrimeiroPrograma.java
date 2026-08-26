package aula0825;

import java.util.Scanner;

public class MeuPrimeiroPrograma {
	public static void main(String[] args) {
		//Biblioteca para leitura de dados
		Scanner scanner = new Scanner(System.in);
		
		
		//Leitura de uma String
		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();
		//Imprimir
		System.out.println("Nome digitado: "+nome);
		
		
		//Leitura de int
		System.out.print("Digite sua idade: ");
		int idade = scanner.nextInt();
		//Imprimir
		System.out.println("Idade digitada: "+idade);
		
		
		//Leitura de double/float
		System.out.print("Digite sua altura: ");
		double altura = scanner.nextDouble();
		//Imprimir
		System.out.println("Altura digitada: "+altura);
		
		
		//Leitura de boolean
		System.out.print("Você gosta de programação? ");
		boolean prog = scanner.nextBoolean();
		//Imprimir
		System.out.println("Resposta: "+prog);
		
		scanner.close();
	}
}
