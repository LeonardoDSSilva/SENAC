package ex03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int[] [] mat = new int[2] [3];

		preencherMatriz(mat);
		System.out.println("Matriz: ");
		exibirMatriz(mat);
		int soma = somarMatriz(mat);
		System.out.println("Somatória de todos os elementos da matriz: " + soma);
	}

	private static void exibirMatriz(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}

	private static int somarMatriz(int[][] mat) {
		int soma = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				soma += mat[i][j];
			}
		}
		return soma;
	}

	private static void preencherMatriz(int[][] mat) {
		Scanner scNum = new Scanner(System.in);
		for (int i = 0; i < mat.length; i++) {
			System.out.println("Informe os elemento da Linha: " + (i + 1));
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("  Coluna " + (j + 1) + ": ");
				mat[i][j] = scNum.nextInt();
			}
			System.out.println();
		}
	}
}
