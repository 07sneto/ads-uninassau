package aula1027;

import java.util.ArrayList;
import java.util.Scanner;

public class IniciandoArrayList {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Array estatico
		String [] listaArray = new String[10];
		
		// ArrayList
		ArrayList <String> listaArrayList = new ArrayList <String>();
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Digite um valor = ");
			String nome = scanner.next();
			listaArrayList.add(nome);
			System.out.println("Tamanho = " + listaArrayList.size() + "\n");
		}
		
		// Alterar/Atualizar
		listaArrayList.set(1, "ALTERADO");
		// Remover/Apagar
		listaArrayList.remove(2);
		
		// Mostrar/Pegar
		for(int i = 0; i < listaArrayList.size(); i++) {
			System.out.printf("Lista no indice ["+i+"] = " + listaArrayList.get(i) + "\n");
		}
		
		scanner.close();
	}
}
