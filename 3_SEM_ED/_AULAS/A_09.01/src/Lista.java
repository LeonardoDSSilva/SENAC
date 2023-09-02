public class Lista<T> extends EstruturaEstatica<T> {
	// Método Construtor com parametros o super porque esta herdando ...
	public Lista(int capacidade){
		super(capacidade);
	}

	// metodo Contrutor sem Paramentos
	public Lista(){
		super();
	}

	public boolean adiciona(T elemento){
		return super.adiciona(elemento);
	}

	public boolean adiciona(int posicao, T elemento){
		return super.adiciona(posicao, elemento);
	}
}
