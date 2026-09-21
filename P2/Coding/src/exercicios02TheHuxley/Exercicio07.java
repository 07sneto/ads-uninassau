package exercicios02TheHuxley;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		// percorre todos os valores de x, de a até b
		for (int x = a; x <= b; x++) {
			int resultado = x * x - 4 * x + 5; // aplica a fórmula x² - 4x + 5
			System.out.println(resultado);
		}

		scanner.close();
	}
} 