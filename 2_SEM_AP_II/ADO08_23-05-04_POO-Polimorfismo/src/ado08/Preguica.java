package ado08;

public class Preguica extends Animal{
	
	public Preguica(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		this.som = "Zzzzzzz";
	}

	public void emitirSom() {
		System.out.println(this.som);
	}
}
