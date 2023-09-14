public class Lista {
	private Animal[] animais;
	private int tamanho;

	public Lista(int quantidade) {
		animais = new Animal[quantidade];
		tamanho = 0;
	}

	public void adicionar(Animal animal) throws Exception {
		if (tamanho < animais.length) {
			animais[tamanho] = animal;
			tamanho++;
		} else {
			throw new Exception("Lista cheia");
		}
	}

	public void remover(int posicao) throws Exception {
		if (posicao >= 0 && posicao < tamanho) {
			for (int i = posicao; i < tamanho - 1; i++) {
				animais[i] = animais[i + 1];
			}
			tamanho--;
		} else {
			throw new Exception("Posicao invalida");
		}
	}

	public void remover(String nome) throws Exception {
		int posicao = buscar(nome);
		if (posicao != -1) {
			remover(posicao);
		} else {
			throw new Exception("Animal nao encontrado");
		}
	}

	public Animal buscar(int posicao) throws Exception {
		if (posicao >= 0 && posicao < tamanho) {
			return animais[posicao];
		} else {
			throw new Exception("Posicao invalida");
		}
	}

	public int buscar(String nome) {
		for (int i = 0; i < tamanho; i++) {
			if (animais[i].getNome().equals(nome)) {
				return i;
			}
		}
		return -1;
	}

	public int getTamanho() {
		return tamanho;
	}

	@Override
	public String toString() {
		String retorno = "";
		for (int i = 0; i < tamanho; i++) {
			retorno += animais[i].toString() + "\n";
		}
		return retorno;
	}

	public void ordenar() {
		for (int i = 0; i < tamanho - 1; i++) {
			int menor = i;
			for (int j = i + 1; j < tamanho; j++) {
				if (animais[j].getNome().compareTo(animais[menor].getNome()) < 0) {
					menor = j;
				}
			}
			Animal aux = animais[i];
			animais[i] = animais[menor];
			animais[menor] = aux;
		}
	}
}
