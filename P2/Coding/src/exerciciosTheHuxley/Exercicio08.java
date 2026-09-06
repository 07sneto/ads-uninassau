package exerciciosTheHuxley;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		double n1 = scanner.nextDouble();
		double n2 = scanner.nextDouble();
		double n3 = scanner.nextDouble();
		
		double media = (n1 + n2 + n3) / 3;
		
		int contador = 0;
		if (n1 > media) contador++;
		if (n2 > media) contador++;
		if (n3 > media) contador++;
		
		System.out.println(contador);
		
        scanner.close();
	}
}
