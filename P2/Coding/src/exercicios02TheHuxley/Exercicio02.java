package exercicios02TheHuxley;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// hasNextInt() verifica se ainda existe outro inteiro pra ler;
		// se não existir, o loop para (fim da entrada)
		while (scanner.hasNextInt()) {
			int i = scanner.nextInt();
			int j = scanner.nextInt();

			int menor = i;
			int maior = j;

			if (menor > maior) {
				int temp = menor;
				menor = maior;
				maior = temp;
			}

			int maiorCiclo = 0;

			// percorre todos os números de menor até maior (incluindo os dois extremos)
			for (int n = menor; n <= maior; n++) {
				int contador = 1;
				int valor = n;

				// aplica a regra do 3n+1 até chegar em 1
				while (valor != 1) {
					if (valor % 2 == 0) {
						valor = valor / 2;
					} else {
						valor = 3 * valor + 1;
					}
					contador++;
				}

				if (contador > maiorCiclo) {
					maiorCiclo = contador;
				}
			}

			System.out.println(i + " " + j + " " + maiorCiclo);
		}

		scanner.close();
	}
}
