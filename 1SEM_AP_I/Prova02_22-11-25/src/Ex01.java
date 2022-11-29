public class Ex01 {
	public static void main(String[] args) {
		int tamanho = 10;
		int[] vetor = new int[tamanho];

		for (int i = 0; i < tamanho; i++) {
			vetor[i] = i;
		}

		for (int i = 0; i < tamanho; i++) {
			if ( i % 2 == 0) {
				System.out.println(vetor[i]);
			}
		}

		System.out.println("Fim!");
	}
}
