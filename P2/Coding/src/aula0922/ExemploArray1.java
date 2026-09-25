package aula0922;

public class ExemploArray1 {

	public static void main(String[] args) {
		
		// Instanciação
		String [] listaDeNomes; // sintaxe atual (recomendada)
		String listaDeNomes []; // sintaxe antiga
		
		// Inicialização
		listaDeNomes = new String [10];
		
		//instaciar e inicializar
		double [] listaDeNotas = new double [100]; //forma mais comum
		
		//adicionando valores
		listaDeNomes[2] = "Thiago";
		listaDeNomes[8] = "Chico";
		listaDeNomes[0] = "Jesus";
		
		//percorrendo valores
		System.out.println();
		for (int i = 0; i < listaDeNomes.length; i++) {
			System.out.println(listaDeNomes[i]);
		}
		
	}
}
