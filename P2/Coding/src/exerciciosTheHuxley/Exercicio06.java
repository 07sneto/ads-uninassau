package exerciciosTheHuxley;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        
        double f = scanner.nextDouble();
        
        double c = (f - 32) * 5.0 / 9.0;
        
        System.out.println(c);
        
        scanner.close();
	}
}
