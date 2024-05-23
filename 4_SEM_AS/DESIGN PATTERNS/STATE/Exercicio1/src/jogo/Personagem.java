package jogo;

import padrao.Esperando;
import padrao.Estados;

public class Personagem {
	private String nome;
	private Estados estado;

	public Personagem(String nome) {
		this.nome = nome;
		this.estado = new Esperando(this);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estados getEstado() {
		return estado;
	}

	public void setEstado(Estados estado) {
		this.estado = estado;
		System.out.println("Personagem " + this.nome + " agora está " + getEstado() + ".");
	}

	public void acionarCorrer() {
		estado.correr();
	}

	public void acionarPular() {
		estado.pular();
	}

	public void acionarAbaixar() {
		estado.abaixar();
	}



}
