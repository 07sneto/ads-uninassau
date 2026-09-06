package exerciciosTheHuxley;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        int angulo1 = scanner.nextInt();
        int angulo2 = scanner.nextInt();

        double angulo3 = 180.0 - angulo1 - angulo2;

        System.out.printf(Locale.US, "3o angulo=%.6f%n", angulo3);

        scanner.close();
	}
}
