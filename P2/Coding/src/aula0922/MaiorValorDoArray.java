package aula0922;

import java.util.Scanner;

public class MaiorValorDoArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o tamanho da lista: ");
		int tamanhoLista = scanner.nextInt();
		
		int [] listaDeNumeros = new int [tamanhoLista];
		
		// Leitura de "tamanhoLista" valores
		for (int i = 0; i < tamanhoLista; i++) {
			System.out.print("Digite o " + (i+1) + "° valor: ");
			listaDeNumeros[i] = scanner.nextInt();
		}
		
		// Encontrando o maior valor
		int maior = listaDeNumeros[0]; // começa considerando o 1° num digitado é o maior.

		for (int i = 1; i < listaDeNumeros.length; i++) { //começa com i = 1, para comparar o segundo num digitado.
			if (listaDeNumeros[i] > maior) { //faz a comparação para ver qual é maior, var i ou var maior.
				maior = listaDeNumeros[i];
			}
		}
		
		System.out.println("Maior número digitado: " + maior);
		
		scanner.close();
	}
}
