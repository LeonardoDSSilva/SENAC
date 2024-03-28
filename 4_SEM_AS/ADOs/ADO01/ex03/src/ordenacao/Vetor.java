package ordenacao;

public class Vetor {
	private int[] vetor;

	public Vetor() {
		vetor = new int[20];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * 100);
		}
	}

	public int[] getVetor() {
		return vetor;
	}

	public void setVetor(int[] vetor) {
		this.vetor = vetor;
	}
	
	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < vetor.length; i++) {
			s += vetor[i] + " ";
		}
		return s;
	}


}
