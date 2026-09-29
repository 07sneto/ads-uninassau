package aula0929;

import java.util.Locale;
import java.util.Scanner;

public class EntradaSaida_21_BaldeTinta {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Altura: ");
		double altura = scanner.nextDouble();
		System.out.print("Largura: ");
		double largura = scanner.nextDouble();
		
		double litrosPorMetroQuadrado = 3.6 / 50;
		double areaDaParede = altura * largura;
		
		double litrosNecessarios = areaDaParede * litrosPorMetroQuadrado;
				
		System.out.printf("São necessários %.2f para pintar a parede.", litrosNecessarios);
		
		scanner.close();
	}
}
