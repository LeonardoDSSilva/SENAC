package ado08;

public class Cachorro extends Animal {
	public Cachorro(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		this.som = "Au au";
	}

	@Override
	public void emitirSom() {
		System.out.println(this.som);
	}
}
