package ex08;

import java.util.Scanner;

public class Ex08 {
	static Scanner scNum = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Digite o tamanho da matriz: ");
		int tamanho = scNum.nextInt();

		int matriz[][] = new int[tamanho][tamanho];

		preencherMatriz(matriz);
		exibirMatriz(matriz);

		verficarQuadradoMagico(matriz);
		
	}

	private static void verficarQuadradoMagico(int[][] matriz) {
		int somarLinhas[] = new int[matriz.length];
		int somarColunas[] = new int[matriz.length];
		int somarDiagonalPrincipal = 0;
		int somarDiagonalSecundaria = 0;
		Boolean quadradoMagico = false;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				somarLinhas[i] += matriz[i][j];
				somarColunas[j] += matriz[i][j];
				if (i == j) {
					somarDiagonalPrincipal += matriz[i][j];
				}
				if (i + j == matriz.length - 1) {
					somarDiagonalSecundaria += matriz[i][j];
				}
			}
		}
		
		
		if (somarDiagonalPrincipal == somarDiagonalSecundaria) {
			for (int i = 0; i < somarColunas.length; i++) {
				if (somarColunas[i] == somarDiagonalPrincipal) {
					for (int j = 0; j < somarLinhas.length; j++) {
						if (somarLinhas[j] == somarDiagonalPrincipal) {
							quadradoMagico = true;
						}
					}
				}
			}
		}

		if (quadradoMagico) {
			System.out.println("É um quadrado mágico!");
		}else {
			System.out.println("Não é um quadrado mágico!");
		}
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
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Digite o valor da linha " + i + " e coluna " + j + ": ");
				matriz[i][j] = scNum.nextInt();
			}
		}
	}
}
