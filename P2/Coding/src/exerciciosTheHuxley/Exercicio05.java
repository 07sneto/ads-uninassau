package exerciciosTheHuxley;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        double xa = scanner.nextDouble();
        double ya = scanner.nextDouble();
        double za = scanner.nextDouble();
        double xb = scanner.nextDouble();
        double yb = scanner.nextDouble();
        double zb = scanner.nextDouble();

        double d = Math.sqrt(Math.pow(xb - xa, 2) + Math.pow(yb - ya, 2) + Math.pow(zb - za, 2));

        System.out.println(d);

        scanner.close();
	}
}
