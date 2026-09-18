package exercicios02TheHuxley;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int soma = 0;

        // repete enquanto ainda sobrar algum dígito em n (ou seja, enquanto n for diferente de 0)
        while (n != 0) {
            soma += n % 10; // n % 10 pega o último dígito de n (resto da divisão por 10) e soma ao total
            n /= 10;        // n /= 10 remove esse último dígito de n (divisão inteira por 10)
        }

        System.out.println(soma);
        
        scanner.close();
	}
}
