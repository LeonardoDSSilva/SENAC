import java.util.ArrayList;

public class Grafo<T> {
	private ArrayList<Vertice<T>> vertices;
	private ArrayList<Aresta<T>> arestas;

	public Grafo() {
		this.vertices = new ArrayList<Vertice<T>>();
		this.arestas = new ArrayList<Aresta<T>>();
	}

	public void adicionaVertice(T dado) {
		Vertice<T> novovertice = new Vertice<T>(dado);
		this.vertices.add(novovertice);
	}

	public void adicionarAresta(Double peso, T dadoInicio, T dadoFim){
		Vertice<T> verticeInicio = this.getVertice(dadoInicio);
		Vertice<T> verticeFim = this.getVertice(dadoFim);
		Aresta<T> novaAresta = new Aresta<T>(peso, verticeInicio, verticeFim);
		verticeInicio.addArestaSaida(novaAresta);
		verticeFim.addArestaEntrada(novaAresta);
		this.arestas.add(novaAresta);
	}

	public Vertice<T> getVertice(T dado) {
		Vertice<T> vertice = null;
		for (Vertice<T> v : this.vertices) {
			if (v.getDado().equals(dado)) {
				vertice = this.vertices.get(this.vertices.indexOf(v));
				break;
			}
		}
		return vertice;
	}

	public void imprimirVertices() {
		for (Vertice<T> v : this.vertices) {
			System.out.println(v.getDado());
		}
	}

	public void imprimirArestas() {
		for (Aresta<T> a : this.arestas) {
			System.out.println(a.getOrigem().getDado() + " -> " + a.getDestino().getDado() + " (" + a.getPeso() + ")");
		}
	}

	public void BuscaEmLargura(){
		ArrayList<Vertice<T>> fila = new ArrayList<Vertice<T>>();
		ArrayList<Vertice<T>> visitados = new ArrayList<Vertice<T>>();
		Vertice<T> vertice = this.vertices.get(0);
		fila.add(vertice);
		while(!fila.isEmpty()){
			vertice = fila.remove(0);
			if(!visitados.contains(vertice)){
				visitados.add(vertice);
				System.out.println(vertice.getDado());
				for(Aresta<T> a : vertice.getArestasSaida()){
					fila.add(a.getDestino());
				}
			}
		}
	}

	public void BuscaEmProfundidade(){
		ArrayList<Vertice<T>> pilha = new ArrayList<Vertice<T>>();
		ArrayList<Vertice<T>> visitados = new ArrayList<Vertice<T>>();
		Vertice<T> vertice = this.vertices.get(0);
		pilha.add(vertice);
		while(!pilha.isEmpty()){
			vertice = pilha.remove(pilha.size()-1);
			if(!visitados.contains(vertice)){
				visitados.add(vertice);
				System.out.println(vertice.getDado());
				for(Aresta<T> a : vertice.getArestasSaida()){
					pilha.add(a.getDestino());
				}
			}
		}
	}
	
}
