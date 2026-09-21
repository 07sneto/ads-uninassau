package exercicios02TheHuxley;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		// laço externo: controla qual é a iteração atual (de 1 até n)
		for (int i = 1; i <= n; i++) {

			// laço interno: imprime os números de 1 até i (o valor da iteração atual)
			for (int j = 1; j <= i; j++) {
				if (j > 1) {
					System.out.print(" ");
				}
				System.out.print(j);
			}
			System.out.println();
		}

		scanner.close();
	}
}