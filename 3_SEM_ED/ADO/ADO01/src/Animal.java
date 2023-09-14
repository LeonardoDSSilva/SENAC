public class Animal {
	
	private String nome;
	private String classificacao;
	private String alimentacao;

	public Animal(String nome, String classificacao, String alimentacao) {
		this.nome = nome;
		this.classificacao = classificacao;
		this.alimentacao = alimentacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public String getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}

	@Override
	public String toString() {
		return " - " + nome + ", classificacao: " + classificacao + ", alimentacao: " + alimentacao;
	}
}

