package aula0825;

import java.util.Scanner;

public class CalculoIdade {
	
	public static void main(String[] args) {
		//Importação da Biblioteca Scanner
		Scanner scanner = new Scanner(System.in);
		
		//Leitura de dado
		System.out.print("Ano de nascimento: ");
		int anoNasc = scanner.nextInt();
		
		//Calculo
		int idade = 2026 - anoNasc;
		
		//Saída de dado
		System.out.println("Idade: "+idade);
		
		scanner.close();
	}

}
