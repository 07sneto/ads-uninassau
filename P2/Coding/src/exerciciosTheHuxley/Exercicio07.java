package exerciciosTheHuxley;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        double ph = scanner.nextDouble();
        
        if (ph < 7) {
            System.out.println("Acida");
        } else if (ph > 7) {
            System.out.println("Basica");
        } else {
            System.out.println("Neutra");
        }
        
        scanner.close();
	}
}
