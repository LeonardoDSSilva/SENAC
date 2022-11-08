public class Ex06 {

  public static void main(String[] args) {
    int[] vetor = {0,1,0,1,1,0,0,1,1,0,0,0,1,1,1,0,1,0,0,1};
    ordenaVetor(vetor);
  }

  private static void ordenaVetor(int[] vetor) {
    int[] vetorOrdenado = new int[vetor.length];
    int cont = 0;
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] == 0) {
        vetorOrdenado[cont] = vetor[i];
        cont++;
      }
    }
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] == 1) {
        vetorOrdenado[cont] = vetor[i];
        cont++;
      }
    }
    exibirVetor(vetorOrdenado);
  }

  private static void exibirVetor(int[] vetorOrdenado) {
	System.out.println();
	for (int num : vetorOrdenado) {
	  System.out.print(num + " ");
	}
  }
}
