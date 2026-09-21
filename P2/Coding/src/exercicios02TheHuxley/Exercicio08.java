package exercicios02TheHuxley;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int contador = 0;
		float soma = 0;
		float menorCre = 0;
		int matriculaMenor = 0;

		// repete até encontrar a matrícula sentinela 999
		while (true) {
			int matricula = scanner.nextInt();

			if (matricula == 999) {
				break; // matrícula sentinela: encerra o loop
			}

			float cre = scanner.nextFloat();

			soma += cre;

			// na primeira leitura (count == 0) ainda não temos "menor" definido, então aceita direto
			// nas seguintes, só atualiza se o CRE atual for menor que o registrado até agora
			if (contador == 0 || cre < menorCre) {
				menorCre = cre;
				matriculaMenor = matricula;
			}

			contador++;
		}

		float media = soma / contador;

		System.out.println(matriculaMenor); // matrícula com o menor CRE
		System.out.printf("%.2f%n", media); // média com 2 casas decimais

		scanner.close();
	}
}
