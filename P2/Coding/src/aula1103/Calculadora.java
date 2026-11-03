package aula1103;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		double valor1 = scanner.nextDouble();
		
		System.out.print("Digite o segundo valor: ");
		double valor2 = scanner.nextDouble();
		
		System.out.println("Soma = "+somar(valor1, valor2));
		System.out.println("Subtração = "+subtrair(valor1, valor2));
		System.out.println("Multiplicação = "+multiplicar(valor1, valor2));
		System.out.println("Divisão = "+dividir(valor1, valor2));
		
		scanner.close();
	}
	
	public static double somar(double n1, double n2) {
		double resultado = n1 + n2;
		return resultado;
	}
	
	public static double subtrair(double n1, double n2) {
		double resultado = n1 - n2;
		return resultado;
	}
	
	public static double multiplicar(double n1, double n2) {
		double resultado = n1 * n2;
		return resultado;
	}
	
	public static double dividir(double n1, double n2) {
		double resultado = n1 / n2;
		return resultado;
	}
	
}
