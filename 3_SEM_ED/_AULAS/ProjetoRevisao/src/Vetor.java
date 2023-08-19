import java.util.Arrays;

public class Vetor {

	private String[] elementos;
	private int  tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	public void adicionar(String elemento) throws Exception{
		if( this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		}
		else{
			throw new Exception("O Vetor ja esta cheio, nao e possivel adicionar ");
		}
	}

	public void adicionar(int posicao, String elemento){
		this.elementos[posicao] = elemento;
	}

	public boolean adicionarIncio(int posicao, String elemento) throws Exception{
		if( posicao >= 0 && posicao < this.tamanho){
			for (int i = this.tamanho -1 ; i >= posicao; i --){
				this.elementos[i + 1] = this.elementos[i];
			}
			this.elementos[posicao] = elemento;
			this.tamanho ++;
		} else{
			throw new Exception("Posição Inválida");
		}
		return false;
	}


	public String buscar(int posicao){
		if( posicao >= 0 && posicao < this.tamanho){
			return this.elementos[posicao];
		}

		return "Posição invalida";
	}

	public int buscarPosicao(String procura){
		for(int i = 0; i < this.tamanho; i ++){
			if(this.elementos[i].equalsIgnoreCase(procura))
				return tamanho;
		}
		return -1;
	}

	public int tamanho(){
		return this.tamanho;
	}


	public String toStringNull(){
		return Arrays.toString(this.elementos);
	}

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("[");

		for(int i = 0; i < this.tamanho; i ++){
			sb.append(this.elementos[i]);
			if( i < this.tamanho - 1){
				sb.append(", ");
			}
		}

		sb.append("]");
		return sb.toString();
	}

}
