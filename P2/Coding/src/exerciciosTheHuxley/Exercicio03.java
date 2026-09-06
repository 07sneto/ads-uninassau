package exerciciosTheHuxley;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        
        int c1 = scanner.nextInt();
        int c2 = scanner.nextInt();
        int c3 = scanner.nextInt();
        int c4 = scanner.nextInt();
        int c5 = scanner.nextInt();

        int somaNecessidades = c1 + c2 + c3 + c4 + c5;
        int sobra = x - somaNecessidades;

        if (sobra > 0) {
            System.out.printf("Abastece e sobra: %d.%n", sobra);
        } else if (sobra == 0) {
            System.out.println("Abastece perfeitamente.");
        } else {
            System.out.println("Insuficiente.");
        }

        scanner.close();
	}
}
