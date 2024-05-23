package padrao;

import jogo.Personagem;

public class Abaixando implements Estados {

	private String estadoAtual = "Abaixando";
	private Personagem personagem;

	public Abaixando(Personagem personagem) {
		this.personagem = personagem;
	}

	@Override
	public void abaixar() {
		System.out.println("Abaixando");
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
		personagem.setEstado(new Pulando(personagem));
	}

	@Override
	public String toString() {
		return "Abaixando [estadoAtual=" + estadoAtual + ", personagem=" + personagem + "]";
	}
}
