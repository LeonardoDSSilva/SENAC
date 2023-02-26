package ex02;

import ex01.Ex01;

public class Ex02 {

  public static void main(String[] args) {
    int[] vetor = Ex01.criarVetor(10);
    exibirVetor(vetor);
  }

  public static void exibirVetor(int[] vetor) {
    for (int i = 0; i < vetor.length; i++) {
      System.out.printf("%d \t", vetor[i]);
    }
    System.out.println();
  }
}
