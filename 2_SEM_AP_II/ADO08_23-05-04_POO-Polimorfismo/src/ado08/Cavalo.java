package ado08;

public class Cavalo extends Animal {
	
	public Cavalo(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		this.som = "Hiin in in";
	}

	public void emitirSom() {
		System.out.println(this.som);
	}
}
