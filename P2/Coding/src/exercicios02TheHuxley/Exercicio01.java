package exercicios02TheHuxley;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(N*i);
		}
		
		scanner.close();
	}
}
