package aula0915;

import java.util.Scanner;

public class MenuCalculadora {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int primeiroValor, segundoValor, resultado;
		resultado = 0;
		
		String opcao = "";
		
		while (!opcao.equals("5")) {
			
			System.out.println("===== CALCULADORA =====");
			System.out.println();
			System.out.println("Opções");
			System.out.println("[1] Soma");
			System.out.println("[2] Subtração");
			System.out.println("[3] Multiplicação");
			System.out.println("[4] Divisão");
			System.out.println("[5] Sair do programa");
			System.out.println();
			System.out.print("Digite sua opção: ");
			opcao = scanner.nextLine();
			
			if (opcao.equals("5")) {
				System.out.println("Saindo...");
				break;
			}
			if (!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3") && !opcao.equals("4")) {
				System.out.println("Opção inválida! Tente novamente.");
				System.out.println();
				continue;
			}
			
			System.out.print("Digite o 1° valor: ");
			primeiroValor = scanner.nextInt();
			System.out.print("Digite o 2° valor: ");
			segundoValor = scanner.nextInt();
			
			scanner.nextLine();
			
			System.out.println();
			switch (opcao) {
				case "1":
	                System.out.println("=== SOMA ===");
	                resultado = primeiroValor + segundoValor;
	                break;
	            case "2":
	                System.out.println("=== SUBTRAÇÃO ===");
	                resultado = primeiroValor - segundoValor;
	                break;
	            case "3":
	                System.out.println("=== MULTIPLICAÇÃO ===");
	                resultado = primeiroValor * segundoValor;
	                break;
	            case "4":
	                System.out.println("=== DIVISÃO ===");
	                if (segundoValor == 0) {
	                    System.out.println("Erro: Não é possível dividir por zero!");
	                    System.out.println();
	                    continue;
	                }
	                resultado = primeiroValor / segundoValor;
	                break;
	        }
			
			System.out.println("Resultado: " + resultado);
			System.out.println();
			
		}
		
		scanner.close();
	}
}
