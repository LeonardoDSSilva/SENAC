package ex07;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		int matriz[][] = new int[4][4];

		preencherMatriz(matriz);
		exibirMatriz(matriz);
		buscarMaiorValor(matriz);

	}

	private static void buscarMaiorValor(int[][] matriz) {
		int maiorValor = matriz[0][0];
		int[] posicao = new int[2];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] > maiorValor) {
					maiorValor = matriz[i][j];
					posicao[0] = (i + 1);
					posicao[1] = (j + 1);
				}
			}
		}
		System.out.println("Maior valor: " + maiorValor);
		System.out.println("Posição: (" + posicao[0] + ", " + posicao[1] + ")");
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
