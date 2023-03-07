package ex10;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner scNum = new Scanner(System.in);

		System.out.print("Qual o tamanho da matriz? ");
		int tamanho = scNum.nextInt();

		desenharDiagonalPrincipal(tamanho);
		desenharDiagonalSecundaria(tamanho);
		desenharContorno(tamanho);
		desenharParteInferior(tamanho);
		desenharParteSuperior(tamanho);

	}

	private static void desenharParteSuperior(int tamanho) {
		String matriz[][] = new String[tamanho][tamanho];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i > j) {
					matriz[i][j] = "1";
				}
				else if (i == j) {
					matriz[i][j] = "0";
				}
				else {
					matriz[i][j] = "0";
				}
			}
		}
		exibirMatriz(matriz);
	}

	private static void desenharParteInferior(int tamanho) {
		String matriz[][] = new String[tamanho][tamanho];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i > j) {
					matriz[i][j] = "1";
				}
				else if (i == j) {
					matriz[i][j] = "1";
				}
				else {
					matriz[i][j] = " ";
				}
			}
		}
		exibirMatriz(matriz);
	}

	private static void desenharContorno(int tamanho) {
		String matriz[][] = new String[tamanho][tamanho];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == 0 || i == matriz.length - 1 || j == 0 || j == matriz[i].length - 1) {
					matriz[i][j] = "1";
				}
				else {
					matriz[i][j] = " ";
				}
			}
		}
		exibirMatriz(matriz);
	}

	private static void desenharDiagonalSecundaria(int tamanho) {
		String matriz[][] = new String[tamanho][tamanho];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i + j == matriz.length - 1) {
					matriz[i][j] = "1";
				}
				else {
					matriz[i][j] = " ";
				}
			}
		}
		exibirMatriz(matriz);
	}

	private static void desenharDiagonalPrincipal(int tamanho) {
		String matriz[][] = new String[tamanho][tamanho];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == j) {
					matriz[i][j] = "1";
				}
				else {
					matriz[i][j] = " ";
				}
			}
		}
		exibirMatriz(matriz);
	}
	private static void exibirMatriz(String matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
					System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}
}
