import java.util.List;

public class ListaEncadeada<Tipo> {
	private No inicio;
	private No fim;
	private int tamanho;

	public ListaEncadeada() {
		this.tamanho = 0;
	}

	public No getInicio() {
		return inicio;
	}

	public void setInicio(No inicio) {
		this.inicio = inicio;
	}

	public No getFim() {
		return fim;
	}

	public void setFim(No fim) {
		this.fim = fim;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public void adicionar(Tipo elemento){
		No<Tipo> celuna = new No<Tipo>(elemento);
		if (this.inicio == null && this.fim == null) {
			this.inicio = celuna;
			this.fim = celuna;
		} else {
			this.fim.setProximo(celuna);
			this.fim = celuna;
		}
		this.tamanho++;
	}

	public No get(int posicao){
		No atual = this.inicio;
		for (int i = 0; i < posicao; i++) {
			if (atual.getProximo() != null) {
				atual = atual.getProximo();
			}
		}
		return atual;
	}

	public void remover(Tipo elemento){
		No anterior = null;
		No atual = this.inicio;

		for (int i = 0; i < this.getTamanho(); i++) {
			if (atual.getElemento().equals(elemento)) {
				if (anterior == null) {
					this.inicio = atual.getProximo();
				} else {
					anterior.setProximo(atual.getProximo());
				}
				this.tamanho--;
				break;
			}
			anterior = atual;
			atual = atual.getProximo();
		}
	}
	
	@Override
	public String toString() {
		return "ListaEncadeada {" +
				"inicio=" + inicio + '}';
	}
}
