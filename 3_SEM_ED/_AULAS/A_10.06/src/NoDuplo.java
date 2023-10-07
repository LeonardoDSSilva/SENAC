public class NoDuplo<T> {
	public T elemento;
	public NoDuplo<T> proximo;
	public NoDuplo<T> anterior;

	// public NoDuplo<T> getProximo() {
	// 	return proximo;
	// }

	// public void setProximo(NoDuplo<T> proximo) {
	// 	this.proximo = proximo;
	// }

	// public NoDuplo<T> getAnterior() {
	// 	return anterior;
	// }

	// public void setAnterior(NoDuplo<T> anterior) {
	// 	this.anterior = anterior;
	// }

	// public T getElemento() {
	// 	return elemento;
	// }

	public NoDuplo() {
	}

	public NoDuplo(T elemento) {
		this.elemento = elemento;
	}
}
