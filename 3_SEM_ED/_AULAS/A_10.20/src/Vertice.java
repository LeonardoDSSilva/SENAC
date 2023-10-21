import java.util.ArrayList;

public class Vertice<T> {
	private T dado;
	private ArrayList<Aresta<T>> arestasEntrada;
	private ArrayList<Aresta<T>> arestasSaida;

	public Vertice(T dado) {
		this.dado = dado;
		this.arestasEntrada = new ArrayList<Aresta<T>>();
		this.arestasSaida = new ArrayList<Aresta<T>>();
	}

	public T getDado() {
		return dado;
	}

	public void setDado(T dado) {
		this.dado = dado;
	}

	public ArrayList<Aresta<T>> getArestasEntrada() {
		return arestasEntrada;
	}

	public void setArestasEntrada(ArrayList<Aresta<T>> arestasEntrada) {
		this.arestasEntrada = arestasEntrada;
	}

	public ArrayList<Aresta<T>> getArestasSaida() {
		return arestasSaida;
	}

	public void setArestasSaida(ArrayList<Aresta<T>> arestasSaida) {
		this.arestasSaida = arestasSaida;
	}

	public void addArestaEntrada(Aresta<T> aresta) {
		this.arestasEntrada.add(aresta);
	}

	public void addArestaSaida(Aresta<T> aresta) {
		this.arestasSaida.add(aresta);
	}
	
}
