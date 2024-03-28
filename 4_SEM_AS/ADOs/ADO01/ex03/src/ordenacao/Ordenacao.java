package ordenacao;

public enum Ordenacao implements Ordenar {
	INSERTION_SORT {
		@Override
		public int[] ordenar(int[] vetor) {
			int i, j, temp;
			for (i = 1; i < vetor.length; i++) {
				temp = vetor[i];
				for (j = i; j > 0 && temp < vetor[j - 1]; j--) {
					vetor[j] = vetor[j - 1];
				}
				vetor[j] = temp;
			}
			return vetor;
		}
	},
	BUBBLE_SORT {
		@Override
		public int[] ordenar(int[] vetor) {
			int i, j, min, aux;
			for (i = 0; i < vetor.length; i++) {
				min = i;
				for (j = i + 1; j < vetor.length; j++) {
					if (vetor[j] < vetor[min]) {
						min = j;
					}
				}
				aux = vetor[i];
				vetor[i] = vetor[min];
				vetor[min] = aux;
			}
			return vetor;
		}
	},
	SELECTION_SORT {
		@Override
		public int[] ordenar(int[] vetor) {
			int i, j, aux;
			for (i = 0; i < vetor.length; i++) {
				for (j = i + 1; j < vetor.length; j++) {
					if (vetor[j] < vetor[i]) {
						aux = vetor[i];
						vetor[i] = vetor[j];
						vetor[j] = aux;
					}
				}
			}
			return vetor;
		}
	};
}
