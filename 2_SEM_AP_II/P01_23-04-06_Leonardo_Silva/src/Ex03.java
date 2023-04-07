public class Ex03 {
	public static void main(String[] args) {
		int [] vetor = {3, 6, 11, 1, 34, 21, 28, 15, 10};
		int [] vetorOrdenado = new int [vetor.length];

		copiarVetor(vetor, vetorOrdenado);
		vetorOrdenado = ordenarVetorBubbleSort(vetorOrdenado);
		
		System.out.println("Vetor original: ");
		exibirVetor(vetor);

		System.out.println("Vetor ordenado: ");
		exibirVetor(vetorOrdenado);
	}

	private static void copiarVetor(int[] vetor, int[] vetorOrdenado) {
		for (int i = 0; i < vetor.length; i++) {
			vetorOrdenado[i] = vetor[i];
		}
	}

	private static int[] ordenarVetorBubbleSort(int[] vetor) {
		int aux = 0;
		boolean troca = true;
		for (int i = 0; i < vetor.length && troca; i++) {
			troca = false;
			for (int j = 0; j < vetor.length - 1; j++) {
				if (vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
					troca = true;
				}
			}
		}
	
		return vetor;
	}

	private static void exibirVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + "\t");
		}
		System.out.println();
	}
}
