package exercicios02TheHuxley;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double valorArvore = scanner.nextDouble();
		double total = valorArvore;

		// repete 3 vezes, uma para cada tipo de enfeite
		for (int i = 0; i < 3; i++) {
			int quantidade = scanner.nextInt();
			double preco = scanner.nextDouble();

			total += quantidade * preco;
		}

		double porFuncionario = total / 21;

		System.out.printf("%.2f%n", total);
		System.out.printf("%.2f%n", porFuncionario);

		scanner.close();
	}
}
