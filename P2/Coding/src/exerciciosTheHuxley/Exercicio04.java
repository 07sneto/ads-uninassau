package exerciciosTheHuxley;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        double d = scanner.nextDouble();
        char w = scanner.next().charAt(0);
        char t = scanner.next().charAt(0);
        int n = scanner.nextInt();
        double v = scanner.nextDouble();

        double dano = d;
        
        if (w == 'A') {
            dano = dano * 0.8;
        } else if (w == 'M') {
            dano = dano * 1.5;
        }
        
        if (t == 'F') {
            dano = dano * 1.2;
        } else if (t == 'M') {
            dano = dano * 0.9;
        }
        
        if (n >= 10) {
            dano = dano * 1.3;
        } else if (n >= 5) {
            dano = dano * 1.1;
        }
        
        System.out.printf("%.2f%n", dano);
        
        if (dano >= v) {
            System.out.println("O monstro foi derrotado!");
        } else {
            System.out.println("O monstro sobreviveu!");
        }
        
        scanner.close();
    }
}
