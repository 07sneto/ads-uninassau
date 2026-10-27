package aula1027;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/* 
		 * Escreva um programa que peça para o usuario digitar
		 * varios valores e os adicione dentro de um arrayList
		 * 
		 * Quando o usuario digitar o valor "FIM", devera ser exibido
		 * os nomes que começam or vogais
		 */
		
		ArrayList <String> lista = new ArrayList <String>();
		
		String nome = "";
		
		while (!(nome.equalsIgnoreCase("FIM"))) {
			System.out.print("Digite um valor = ");
			nome = scanner.next();
			lista.add(nome);
		}
		
		System.out.println("\nNomes que iniciam com vogais: ");
		
		for (int i = 0; i < lista.size(); i++) {
			String palavra = lista.get(i);
            char primeiraLetra = Character.toLowerCase(palavra.charAt(0));
            
            if (primeiraLetra == 'a' || primeiraLetra == 'e' || primeiraLetra == 'i' || primeiraLetra == 'o' || primeiraLetra == 'u') {
                System.out.println(palavra);
            }
		}
		
		scanner.close();
	}
}
