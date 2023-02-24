package ex01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int[] vetor = criarVetor(10);

	}

	public static int[] criarVetor(int tamVetor) {
		int[] vetor = new int[tamVetor];
		Scanner scNum = new Scanner(System.in);

		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite %dª número: ", i + 1);
			vetor[i] = scNum.nextInt();
		}
		return vetor;
	}
}
