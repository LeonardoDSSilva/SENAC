package estados;

import modelo.Tarefa;

public class Concluida implements Estados {

	private String estadoAtual = "Concluida";
	private Tarefa tarefa;

	public Concluida(Tarefa tarefa) {
		this.tarefa = tarefa;
	}

	@Override
	public void atrasar() {
		System.out.println("Ja esta Concluida");

	}

	@Override
	public void concluir() {
		System.out.println("Ja esta Concluida");
	}

	@Override
	public void pendente() {
		tarefa.setEstado(new Pentende(tarefa));
	}

}
