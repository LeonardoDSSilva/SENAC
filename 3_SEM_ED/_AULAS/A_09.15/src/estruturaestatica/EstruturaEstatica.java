package estruturaestatica;

public class EstruturaEstatica<T> {
	public T[] elementos;
	public int tamanho;

	// metodo Construtor com parametro
	public EstruturaEstatica(int capacidade){
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

	// metodo Construtor sem parametro
	public EstruturaEstatica(){
		this(10);
	}
	
	// metodo para adicionar elementos 
	public boolean adiciona (T elemento){
		this.aumentaCapacidade();
		if(this.tamanho <this.elementos.length){
			this.elementos[this.tamanho] =elemento;
			this.tamanho ++;
			return true;
		}
		return false;
	}

	// metodo para adicionar em qualque posicao
	public boolean adiciona(int posicao, T elemento){
		if(!(posicao >= 0 && posicao < posicao)){
			throw new IllegalArgumentException("Posisao Invalida");
		}
		this.aumentaCapacidade();
		for(int i = this.tamanho - 1; i >= posicao; i--){
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;
	}

	// metodo para aumentar a capacidade do vetor
	private void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length){
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < elementosNovos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	public int tamanho(){
		return this.tamanho;
	}

	@Override
	public String toString(){
		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.tamanho; i++) {
			s.append(this.elementos[i]);
			s.append((i <  this.tamanho - 1)? ", ":"");
		}
		s.append("]");

		return s.toString();
	}

	public boolean estaVazia(){
		return this.tamanho == 0;
	}

	public void remove (int posicao){
		if(!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posicao Invalida");
		}
		for (int i = 0; i < elementos.length - 1; i++) {
			elementos[i] = elementos[i+1];
		}
		tamanho --;
	}
}
