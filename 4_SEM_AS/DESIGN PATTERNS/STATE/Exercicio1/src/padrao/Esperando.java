package padrao;

import jogo.Personagem;

public class Esperando implements Estados {

	private String estadoAtual = "Esperando";
	private Personagem personagem;

	public Esperando(Personagem personagem) {
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
	}

	@Override
	public void pular() {
		personagem.setEstado(new Pulando(personagem));
	}

	@Override
	public String toString() {
		return "Esperando [estadoAtual=" + estadoAtual + ", personagem=" + personagem + "]";
	}

}
