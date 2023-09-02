public class Pilha<T> extends EstruturaEstatica<T> {
	public Pilha(){
		super();
	}
	public Pilha(int capacidade){
		super(capacidade);
	}

	public void empilha(T elemento){
		// dessa forma estamos reutilizando o codigo da classe pai
		super.adiciona(elemento);
	}
	
	public T topo(){
		if(this.estaVazia()){
			return null;
		 } else{
			return this.elementos[tamanho-1];
		 }
	}

	public T desempilha(){
		if (this.estaVazia()) {
			return null;
		}
		T elemento = this.elementos[tamanho - 1];
		tamanho --;
		return elemento;
	}
}
