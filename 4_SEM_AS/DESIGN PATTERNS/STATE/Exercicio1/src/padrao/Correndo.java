package padrao;

import jogo.Personagem;

public class Correndo implements Estados {

	private String estadoAtual = "Correndo";
	private Personagem personagem;

	public Correndo(Personagem personagem) {
		this.personagem = personagem;
	}

	@Override
	public void abaixar() {
		personagem.setEstado(new Abaixando(personagem));
	}

	@Override
	public void correr() {
		System.out.println("Correndo");
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
		return "Correndo [estadoAtual=" + estadoAtual + ", personagem=" + personagem + "]";
	}
	

	

}
