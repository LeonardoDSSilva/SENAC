package ex02;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		int linha = 2, coluna = 3;
		int[] [] matriz = new int[linha] [coluna];
		int[] [] matrizTransposta = new int[coluna] [linha];

		preencherMatriz(matriz);
		System.out.println("Matriz: ");
		exbirMatriz(matriz);
		System.out.println();
		matrizTransposta = transporMatriz(matriz);
		System.out.println("Matriz Transposta: ");
		exbirMatriz(matrizTransposta);
		System.out.println();

	}

	private static int[][] transporMatriz(int[][] matriz) {
		int[][] matrizTransposta = new int[matriz[0].length] [matriz.length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matrizTransposta[j][i] = matriz[i][j];
			}
		}
		return matrizTransposta;
	}

	private static void exbirMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println("\n");
		}
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
