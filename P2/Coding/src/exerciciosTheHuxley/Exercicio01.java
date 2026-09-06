package exerciciosTheHuxley;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double nota1, nota2, nota3, media, mdp1, mdp2;
		
		nota1 = scanner.nextDouble();
		nota2 = scanner.nextDouble();
		nota3 = scanner.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 2;
		mdp1 = (nota1*2 + nota2*2 + nota3*3) / 7;
		mdp2 = (nota1*1 + nota2*2 + nota3*3) / 5;
		
		System.out.printf("%.2f%n", media);
		System.out.printf("%.2f%n", mdp1);
		System.out.printf("%.2f%n", mdp2);
		
		scanner.close();
	}
}
