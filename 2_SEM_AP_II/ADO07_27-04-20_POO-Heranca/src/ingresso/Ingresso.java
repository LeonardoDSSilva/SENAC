package ingresso;

public class Ingresso {
	private String nome;
	private double valor;


	public Ingresso() {
	}

	public Ingresso(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}

	public void imprimeValor() {
		System.out.println("O Preço do ingresso " + this.getNome() + " é: " + this.getValor());
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	
}
