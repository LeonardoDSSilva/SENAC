package padrao;

import jogo.Personagem;

public class Pulando implements Estados {

	private String estadoAtual = "Pulando";
	private Personagem personagem;

	public Pulando(Personagem personagem) {
		this.personagem = personagem;
	}

	@Override
	public void abaixar() {
		personagem.setEstado(new Abaixando(personagem));
	}

	@Override
	public void correr() {
		personagem.setEstado(new Correndo(personagem));
	}

	@Override
	public void esperar() {
		personagem.setEstado(new Esperando(personagem));
	}

	@Override
	public void pular() {
		System.out.println("Pulando");
	}

	@Override
	public String toString() {
		return "Pulando [estadoAtual=" + estadoAtual + ", personagem=" + personagem + "]";
	}

	

}
