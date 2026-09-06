package exerciciosTheHuxley;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        int idadeAdotante = scanner.nextInt();
        String irmaoAscendente = scanner.next();
        String adocaoConjunta = scanner.next();
        String casadosUniaoEstavel = scanner.next();
        int idadeAdotando = scanner.nextInt();
        String paisDesconhecidosOuDestituidos = scanner.next();
        String consentimentoPais = scanner.next();
        String consentimentoAdotandoMaior12 = scanner.next();
        
        boolean podeAdotar = true;
        
        if (idadeAdotante < 18) podeAdotar = false;
        if (irmaoAscendente.equals("S")) podeAdotar = false;
        if (adocaoConjunta.equals("S") && !casadosUniaoEstavel.equals("S")) podeAdotar = false;
        if ((idadeAdotante - idadeAdotando) < 16) podeAdotar = false;
        if (paisDesconhecidosOuDestituidos.equals("S") && !consentimentoPais.equals("S")) podeAdotar = false;
        if (idadeAdotando > 12 && !consentimentoAdotandoMaior12.equals("S")) podeAdotar = false;
        
        if (podeAdotar) {
            System.out.println("Pode adotar");
        } else {
            System.out.println("Nao pode adotar");
        }
        
        scanner.close();
	}
}
