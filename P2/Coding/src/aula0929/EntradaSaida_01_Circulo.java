package aula0929;

import java.util.Locale;
import java.util.Scanner;

public class EntradaSaida_01_Circulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o raio do círculo: ");
		float raio = scanner.nextFloat();
		
		double area = Math.PI * raio * raio;
		double comprimento = 2 * Math.PI * raio;
		
		System.out.println("Área = "+area);
		System.out.println("Comprimento = "+comprimento);
		
		scanner.close();
	}
}
