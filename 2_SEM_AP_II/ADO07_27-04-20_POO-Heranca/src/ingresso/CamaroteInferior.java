package ingresso;

public class CamaroteInferior extends Vip {

	private String localizacao;
	private double valorAdicional;

	public CamaroteInferior() {
		super();
		this.localizacao = "Camarote Inferior";
		this.valorAdicional = 50.0;
		this.setNome("Camarote Inferior");
	}

	public void imprimirValor() {
		System.out.println("O Preço do ingresso é: " + (this.getValor() + this.valorAdicional));
	}

	public void imprimirLocalizacao() {
		System.out.println("O camarote superior fica na " + this.localizacao);
	}
	
}
