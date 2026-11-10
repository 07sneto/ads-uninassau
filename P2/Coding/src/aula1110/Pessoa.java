package aula1110;

public class Pessoa {

	// Atributos
	String nome;
	String endereco;
	double peso;
	double altura;
	
	// Construtor
	public Pessoa(String novoNome, String novoEndereco, double novoPeso, double novoAltura) {
		this.nome = novoNome;
		this.endereco = novoEndereco;
		this.peso = novoPeso;
		this.altura = novoAltura;
	}

	// Metodo/Funções
	public void verDados() {
		System.out.println("Nome: "+nome);
		System.out.println("Peso: "+peso);
		System.out.println("Altura: "+altura);
	}
	
	public void verEndereco() {
		System.out.println("Endereço: "+endereco);
	}
	
}
