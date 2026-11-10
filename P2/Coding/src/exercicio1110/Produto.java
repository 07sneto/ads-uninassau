package exercicio1110;

public class Produto {

	// Atributos
	String nome;
	String marca;
	int id;
	
	// Construtor
	public Produto(String novoNome, String novaMarca, int novoId) {
		this.nome = novoNome;
		this.marca = novaMarca;
		this.id = novoId;
	}

	// Métodos/Funções
	public void verProduto() {
		System.out.println("Nome: "+nome);
		System.out.println("Marca: "+marca);
	}
	
	public void verId() {
		System.out.println("Id: "+id);
	}
}
