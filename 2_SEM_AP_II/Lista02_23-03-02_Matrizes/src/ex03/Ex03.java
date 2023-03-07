package ex03;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		int matriz[][] = new int[2][5];
		int somarLinhas[] = new int[matriz.length];

		preencherMatriz(matriz);
		somarLinhas(matriz, somarLinhas);
		exibirMatriz(matriz, somarLinhas);
		
	}

	private static void somarLinhas(int[][] matriz, int[] somarLinhas) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				somarLinhas[i] += matriz[i][j];
			}
		}
	}

	private static void exibirMatriz(int[][] matriz, int[] somarLinhas) {
		int somatoria = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.print("-> " + somarLinhas[i] + "\n");
			somatoria += somarLinhas[i];
		}
		System.out.println("\t total = " + somatoria + "\t");
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
