package exercicios02TheHuxley;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		// repete lendo casos de teste até encontrar o número 0 (sentinela)
		while (true) {
			int x = scanner.nextInt();

			if (x == 0) {
				break; // 0 indica fim da entrada, encerra o loop
			}

			// todo número ímpar pode ser escrito como n² - (n-1)²
			// isolando n na fórmula x = 2n - 1, temos n = (x+1)/2
			int n = (x + 1) / 2;

			// imprime no formato "quadrado maior - quadrado menor"
			System.out.println((n * n) + " - " + ((n - 1) * (n - 1)));
		}

		scanner.close();
	}
}
