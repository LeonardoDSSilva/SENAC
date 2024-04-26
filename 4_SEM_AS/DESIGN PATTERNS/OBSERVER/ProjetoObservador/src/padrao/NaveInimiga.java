package padrao;

public class NaveInimiga implements Observador {

	private String nome;
	
	public NaveInimiga(String nome, Assunto assunto){
		assunto.adicionar(this);
		this.nome = nome;
	}

	@Override
	public void atualizar(Acao acao) {
		System.out.println(nome + " - " + acao);
	}

}
