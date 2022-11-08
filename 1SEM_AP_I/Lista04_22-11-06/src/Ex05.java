import java.util.Random;

public class Ex05 {

  public static void main(String[] args) {
    int[] vetor = new int[10];
    Random numRandom = new Random();
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = numRandom.nextInt(50);
    }
    exibirVetor(vetor);
    buscarMaior(vetor);
    buscarMenor(vetor);
  }

  private static void exibirVetor(int[] vetor) {
	for (int num : vetor) {
	  System.out.print(num + " ");
	}
	System.out.println();
  }

  private static void buscarMenor(int[] vetor) {
    int menor = vetor[0];
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] < menor) {
        menor = vetor[i];
      }
    }
    System.out.println("O menor número é: " + menor);
  }

  public static void buscarMaior(int[] vetor) {
    int maior = 0;
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] > maior) {
        maior = vetor[i];
      }
    }
    System.out.println("O maior número é: " + maior);
  }
}
