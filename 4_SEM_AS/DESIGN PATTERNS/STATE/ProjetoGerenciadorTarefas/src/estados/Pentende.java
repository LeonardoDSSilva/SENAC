package estados;

import modelo.Tarefa;

// cocrete state
public class Pentende implements Estados {

	private String estadoAtual = "Pentende";
	private Tarefa tarefa;

	public Pentende(Tarefa tarefa) {
		this.tarefa = tarefa;
	}

	@Override
	public void atrasar() {
		tarefa.setEstado(new Atrasada(tarefa));
	}

	@Override
	public void concluir() {
		tarefa.setEstado(new Concluida(tarefa));
	}

	@Override
	public void pendente() {
		System.out.println("Ja esta Pentende");
	}

	@Override
	public String toString() {
		return "Pentende [estadoAtual=" + estadoAtual + "]";
	}
}
