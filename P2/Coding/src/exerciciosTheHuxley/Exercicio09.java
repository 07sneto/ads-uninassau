package exerciciosTheHuxley;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();

        if (id == 0) {
            System.out.println("rosa rosa verde rosa");
        } else if (id == 1) {
            System.out.println("verde rosa verde rosa");
        } else if (id == 2) {
            System.out.println("verde verde verde rosa");
        } else if (id == 3) {
            System.out.println("rosa verde verde rosa");
        } else if (id == 4) {
            System.out.println("rosa rosa rosa verde");
        } else if (id == 5) {
            System.out.println("verde rosa rosa verde");
        } else if (id == 6) {
            System.out.println("verde verde rosa verde");
        } else if (id == 7) {
            System.out.println("rosa verde rosa verde");
        } else if (id == 8) {
            System.out.println("verde verde verde verde");
        } else if (id == 9) {
            System.out.println("rosa rosa rosa rosa");
        } else if (id == 10) {
            System.out.println("rosa rosa verde verde");
        } else if (id == 11) {
            System.out.println("verde verde rosa rosa");
        }

        scanner.close();
	}
}
