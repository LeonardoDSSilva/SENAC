package ex05;

import java.util.Random;

public class Ex05 {
	public static void main(String[] args) {
		int matriz01[][] = new int[2][2];
		int matriz02[][] = new int[2][1];

		preencherMatriz(matriz01);
		preencherMatriz(matriz02);
		exibirMatriz(matriz01);
		System.out.println("   x ");
		exibirMatriz(matriz02);
		System.out.println("   = ");
		multiplicarMatrizes(matriz01, matriz02);
	}

	private static void multiplicarMatrizes(int[][] matriz01, int[][] matriz02) {
		int matriz[][] = new int[matriz01.length][matriz02[0].length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				for (int k = 0; k < matriz01[0].length; k++) {
					matriz[i][j] += matriz01[i][k] * matriz02[k][j];
				}
			}
		}
		exibirMatriz(matriz);
	}

	private static void exibirMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private static void preencherMatriz(int[][] matriz) {
		Random random = new Random();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = random.nextInt(10);
			}
		}
	}
}
