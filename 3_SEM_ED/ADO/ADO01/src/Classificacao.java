public enum Classificacao {
	
	Mamifero("Mamifero"),
	Ave("Ave"),
	Reptil("Reptil"),
	Peixe("Peixe"),
	Anfibio("Anfibio");
	
	private String classificacao;

	Classificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public String getClassificacao() {
		return classificacao;
	}
}

