package ex06;

import java.util.Random;

public class Ex06 {
	public static void main(String[] args) {
		int matriz[][] = new int[4][4];

		preencherMatriz(matriz);
		exibirMatriz(matriz);
		buscarMenorValor(matriz);

	}

	private static void buscarMenorValor(int[][] matriz) {
		int menorValor = matriz[0][0];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < menorValor) {
					menorValor = matriz[i][j];
				}
			}
		}
		System.out.println("Menor valor: " + menorValor);
	}

	private static void exibirMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}

	private static void preencherMatriz(int[][] matriz) {
		Random random = new Random();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = random.nextInt(25);
			}
		}
	}
}
