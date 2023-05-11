package ADO08;

public class Gato extends Animal {

	// public Gato() {
	// 	super();
	// }

	public Gato(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public void emitirSom() {
		System.out.println("Meu nome é " + getNome() + " e eu tenho " + getIdade() + " anos. Miau!");
	}
	
}
