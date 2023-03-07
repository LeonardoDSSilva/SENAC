package ex04;

import java.util.Random;

public class Ex04 {
	public static void main(String[] args) {
		int lin = 2, col = 5;
		int matriz01[][] = new int[lin][col];
		int matriz02[][] = new int[lin][col];

		preencherMatriz(matriz01);
		preencherMatriz(matriz02);
		exibirMatriz(matriz01);
		System.out.println("   - ");
		exibirMatriz(matriz02);
		System.out.println("   = ");
		subtrairMatrizes(matriz01, matriz02);
		
	}
	private static void subtrairMatrizes(int[][] matriz01, int[][] matriz02) {
		int matriz[][] = new int[matriz01.length][matriz01[0].length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = matriz01[i][j] - matriz02[i][j];
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
				matriz[i][j] = random.nextInt(15);
			}
		}
	}
}
