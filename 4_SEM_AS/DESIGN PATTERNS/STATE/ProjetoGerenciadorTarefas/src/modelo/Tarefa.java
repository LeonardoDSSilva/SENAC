package modelo;

import estados.Estados;
import estados.Pentende;

// Context

public class Tarefa {
	private String descricao;
	private Estados estado;

	public Tarefa(String descricao) {
		estado = new Pentende(this);
		this.descricao = descricao;
	}

	public Estados getEstado() {
		return estado;
	}

	public void setEstado(Estados estado) {
		this.estado = estado;
		System.out.println(getEstado());
	}

	public void acionarTarefaAtrasada() {
		estado.atrasar();
	}

	public void acionarTarefaPendente() {
		estado.pendente();
	}

	public void acionarTarefaConcluida() {
		estado.concluir();
	}

}
