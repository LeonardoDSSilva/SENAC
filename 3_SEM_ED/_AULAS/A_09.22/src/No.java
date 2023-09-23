public class No<Tipo> {
	private Tipo elemento;
	private No<Tipo> proximo;

	public No(Tipo elemento) {
		this.elemento = elemento;
		this.proximo = null;
	}

	public Tipo getElemento() {
		return elemento;
	}

	public void setElemento(Tipo elemento) {
		this.elemento = elemento;
	}

	public No<Tipo> getProximo() {
		return proximo;
	}

	public void setProximo(No<Tipo> proximo) {
		this.proximo = proximo;
	}

	@Override
	public String toString() {
		return "No{" +
				"elemento=" + elemento +
				", proximo=" + proximo +
				'}';
	}
}