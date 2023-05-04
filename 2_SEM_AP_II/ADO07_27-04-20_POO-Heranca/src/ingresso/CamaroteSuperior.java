package ingresso;

public class CamaroteSuperior extends Vip{

	private String localizacao;
	private double valorAdicional;
	
	public CamaroteSuperior() {
		super();
		this.localizacao = "Camarote Superior";
		this.valorAdicional = 100.0;
		this.setNome("Camarote Superior");
	}
	
	public void imprimirValor() {
		System.out.println("O Preço do ingresso " + this.getNome() + " é: " + (this.getValor() + this.valorAdicional));
	}	


	public double exibirValor() {
		return this.getValor() + this.valorAdicional;
	}
}
