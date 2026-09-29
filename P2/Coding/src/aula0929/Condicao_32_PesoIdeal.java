package aula0929;

import java.util.Locale;
import java.util.Scanner;

public class Condicao_32_PesoIdeal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double pesoIdeal = 0;
		
		System.out.print("Sexo: ");
		char sexo = scanner.next().charAt(0);
		System.out.print("Altura: ");
		double altura = scanner.nextDouble();
		
		if (sexo == 'm') {
			pesoIdeal = 72.7 * altura - 58;
		} else if (sexo == 'f'){
			pesoIdeal = 62.1 * altura - 44.7;
		}
		
		System.out.printf("Peso Ideal = %.3f", pesoIdeal);
		
		scanner.close();
	}
}
