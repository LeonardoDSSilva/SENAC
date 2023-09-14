public enum Alimentacao {
	
	Carnivoro("Carnivoro"),
	Herbivoro("Herbivoro"),
	Onivoro("Onivoro");

	private String alimentacao;

	Alimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}

	public String getAlimentacao() {
		return alimentacao;
	}
}