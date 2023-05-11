package ADO08;

public class Cachorro extends Animal{

	// public Cachorro() {
	// 	super();
	// }

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public void emitirSom() {
		System.out.println("Eu sou um Cachorro. Meu nome é " + getNome() + " e eu tenho " + getIdade() + " anos. Au au au!");
	}

}
	
