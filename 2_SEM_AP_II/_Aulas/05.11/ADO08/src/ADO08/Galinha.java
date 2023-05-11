package ADO08;

public class Galinha extends Animal{
	
	// public Galinha() {
	// 	super();
	// }

	public Galinha(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public void emitirSom() {
		System.out.println("Meu nome é " + getNome() + " e eu tenho " + getIdade() + " anos. Cocoricó!");
	}
}
