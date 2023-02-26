package ex17;

import java.util.Scanner;

import ex02.Ex02;

public class Ex17 {
	public static void main(String[] args) {
		int[] vetor = criarVetor(10);
		System.out.println("Vetor: ");
		Ex02.exibirVetor(vetor);
	}

	public static int[] criarVetor(int tamVetor) {
		int[] vetor = new int[tamVetor];
		Scanner scNum = new Scanner(System.in);

		for (int i = 0; i < vetor.length; i++) {
			boolean numeroExiste = false;
			do{
				numeroExiste = false;
				System.out.printf("Digite %dª número: ", i + 1);
				int num = scNum.nextInt();
				for (int j = 0; j < i; j++) {
					if (num == vetor[j]) numeroExiste = true;
				}
				if (numeroExiste) {
					System.out.println("Numero ja Existe, Informe outro !");
				} else {
					vetor[i] = num;
				}
			} while(numeroExiste);
		}
		scNum.close();
		return vetor;
	}
}
