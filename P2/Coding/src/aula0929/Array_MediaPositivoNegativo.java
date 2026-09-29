package aula0929;

import java.util.Scanner;

public class Array_MediaPositivoNegativo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o tamanho da lista: ");
		int tamanhoLista = scanner.nextInt();
		
		double [] numero = new double [tamanhoLista];
		double somaPositivos = 0;
		double somaNegativos = 0;
		int quanPositivos = 0;
		int quanNegativos = 0;
		
		for (int i=0; i<tamanhoLista; i++) {
			System.out.print("Digite o " + (i+1) + "° valor: ");
			numero[i] = scanner.nextInt(); // guarda o numero na posição do i da lista
			
				// Comparando se é Positivo ou Negativo
				if (numero[i] > 0) { 
					somaPositivos += numero[i]; // junta o valor digitado
					quanPositivos += 1; // adiciona a quantidade de numeros Positivos digitados
				} else if (numero[i] < 0) {
					somaNegativos += numero[i]; // junta o valor digitado
					quanNegativos += 1; // adiciona a quantidade de numeros Negativos digitados
				}
		}
		
		double mediaPositivos = somaPositivos / quanPositivos;
		double mediaNegativos = somaNegativos / quanNegativos;
		
		System.out.println("");
		System.out.printf("Média Positivos = %.1f%n",mediaPositivos);
		System.out.printf("Média Negativos = %.1f",mediaNegativos);
		
		scanner.close();
	}
}
