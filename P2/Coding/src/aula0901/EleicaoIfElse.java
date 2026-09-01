package aula0901;

import java.util.Scanner;

public class EleicaoIfElse {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		int idade = scanner.nextInt();
		
		
		if(idade < 0) {
			System.out.println("A idade " +idade+" é invalida.");
		} else if(idade >= 0 && idade <= 15) {
			System.out.println("Não pode votar");
		} else if(idade >= 16 && idade <= 17) {
			System.out.println("Facultativo.");
		} else if(idade >= 18 && idade < 70) {
			System.out.println("Obrigatorio.");
		} else {
			System.out.println("Voto facultativo.");
		}
		
		
		
		
		
		
		scanner.close();
	}

}
