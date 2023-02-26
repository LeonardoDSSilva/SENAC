package ex05;

import ex01.Ex01;
import ex02.Ex02;

public class Ex05 {
	public static void main(String[] args) {
		int[] vet1 = Ex01.criarVetor(8);
		int[] vet2 = inverterVetor(vet1);

		System.out.println("Vetor 1: ");
		Ex02.exibirVetor(vet1);
		System.out.println("Vetor 2: ");
		Ex02.exibirVetor(vet2);
	}

	private static int[] inverterVetor(int[] vet1) {
		int[] vet2 = new int[vet1.length];
		int aux = 0;
		for (int i = vet1.length - 1; i >= 0; i--) {
			vet2[aux] = vet1[i];
			aux++;
		}
		return vet2;
	}
}
