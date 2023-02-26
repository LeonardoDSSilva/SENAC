package ex03;

import ex01.Ex01;
import ex02.Ex02;

public class Ex03 {

  public static void main(String[] args) {
    int[] vetor = Ex01.criarVetor(8);

    System.out.println("Vetor: ");
    Ex02.exibirVetor(vetor);
    encontrarMaiorValor(vetor);
  }

  private static void encontrarMaiorValor(int[] vetor) {
    int maiorValor = vetor[0];
    int indice = 0;
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] > maiorValor) {
        maiorValor = vetor[i];
      }
    }
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] == maiorValor) {
        System.out.printf(
            "Maior valor: %d que se encontra no índice %d\n",
            maiorValor,
            i + 1);
      }
    }
  }
}
