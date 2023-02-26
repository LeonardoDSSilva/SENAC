package ex08;

import ex02.Ex02;
import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		int[] vet01 = new int[6];
		lerVetores(vet01);
		int[] vet02 = inverterVetor(vet01);
		System.out.println("Vetor 1: ");
		Ex02.exibirVetor(vet01);
		System.out.println("Vetor 2: ");
		Ex02.exibirVetor(vet02);
	}

	private static void lerVetores(int[] vetor) {
		Scanner scNum = new Scanner(System.in);
		for(int i =0; i < vetor.length; i++){
			do {
				System.out.print("Informe um numero par: ");
				vetor[i] = scNum.nextInt();
				if (vetor[i]%2 != 0) System.out.println("Tem q se Par,Tente Novamente!");
			} while (vetor[i]%2 != 0);
		}
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
