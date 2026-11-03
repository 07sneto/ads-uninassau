package aula1103;

import java.util.Scanner;

public class Citacao {
	
	/* Escreva um programa que o usúario irá digitar o nome completo
	 * um titulo, e uma data de acesso. Por fim, crie uma função que receba
	 * estes três parâmetros e printe o resultado de uma referência bibliográfica
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Titulo: ");
		String titulo = scanner.nextLine();
		
		System.out.print("Data: ");
		String data = scanner.nextLine();
	
		System.out.println(citacao(nome, titulo, data));
		
		scanner.close();
	}
	
	public static String citacao(String nome, String titulo, String data) {
		
		if (!nome.contains(" ")) {
			return "Erro: Digite o nome completo (nome e sobrenome)!";
		}
		String primeiroNome = nome.substring(0, nome.indexOf(" "));
	    String ultimoNome = nome.substring(nome.lastIndexOf(" ") + 1);
		
		return "aReferência: " + ultimoNome.toUpperCase() + ", " + primeiroNome + ". " + titulo + ". " + data + ".";
	}
}
