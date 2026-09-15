package aula0915;

import java.util.Scanner;

public class SomaCumulativaIndeterminadaV1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int digitado, soma;
		
		digitado = 1;
		soma = 0;
		
		while (digitado != 0) {
			System.out.print("Digite um número: ");
			digitado = scanner.nextInt();
			soma = soma + digitado;
			System.out.println("Soma parcial = " + soma);
		}
		
		System.out.println("Voce digitou " + digitado + ", por isso o programa encerrou.");
		
		scanner.close();
	}
}
