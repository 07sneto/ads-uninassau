package exercicios02TheHuxley;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		double soma = 0;

		// repete n vezes, uma leitura por nota
		for (int i = 0; i < n; i++) {
			double nota = scanner.nextDouble(); // lê a nota atual
			soma += nota;
		}

		double media = soma / n; // calcula a média aritmética
		media = Math.round(media * 10.0) / 10.0; // arredonda para 1 casa decimal (equivalente ao round(media, 1))

		System.out.println(media);

		scanner.close();
	}
}
