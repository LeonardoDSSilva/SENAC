public class Aresta<T> {
	private Double peso;
	private Vertice<T> origem;
	private Vertice<T> destino;

	public Aresta(Double peso, Vertice<T> origem, Vertice<T> destino) {
		this.peso = peso;
		this.origem = origem;
		this.destino = destino;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Vertice<T> getOrigem() {
		return origem;
	}

	public void setOrigem(Vertice<T> origem) {
		this.origem = origem;
	}

	public Vertice<T> getDestino() {
		return destino;
	}

	public void setDestino(Vertice<T> destino) {
		this.destino = destino;
	}
	
}
