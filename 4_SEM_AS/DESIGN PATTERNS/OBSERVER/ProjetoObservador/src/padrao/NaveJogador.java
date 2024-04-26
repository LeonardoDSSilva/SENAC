package padrao;

import java.util.LinkedList;
import java.util.List;

public class NaveJogador implements Assunto {

	private String nome;
	private Acao acao;
	private List<Observador> lista; // Relacao um para muitos

	public NaveJogador(String nome) {
		this.nome = nome;
		lista = new LinkedList<>();
	}

	@Override
	public void adicionar(Observador observador) {
		lista.add(observador);
	}

	@Override
	public void setAcao(Acao acao) {
		this.acao = acao;
		notificar();
	}

	@Override
	public void notificar() {
		for (Observador observador : lista) {
			observador.atualizar(acao);
		}
	}

}
