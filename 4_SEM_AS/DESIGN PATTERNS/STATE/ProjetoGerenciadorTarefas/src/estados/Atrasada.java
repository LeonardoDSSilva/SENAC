package estados;

import modelo.Tarefa;

public class Atrasada implements Estados {

	private String estadoAtual = "Atrasada";
	private Tarefa tarefa;

	public Atrasada(Tarefa tarefa) {
		this.tarefa = tarefa;
	}

	@Override
	public void atrasar() {
		System.out.println("Esta tarefa ja esta Atrasada");
	}

	@Override
	public void concluir() {
		tarefa.setEstado(new Concluida(tarefa));
	}

	@Override
	public void pendente() {
		System.out.println("Esta tarefa ja esta Atrasada");
	}

	@Override
	public String toString() {
		return "Atrasada [estadoAtual=" + estadoAtual + "]";
	}
}
