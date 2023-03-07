package ex09;

import java.util.Scanner;

public class Ex09 {
	static Scanner scNum = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.print("Digite o número de linhas da matriz: ");
		int linhas = scNum.nextInt();

		System.out.print("Digite o número de colunas da matriz: ");
		int colunas = scNum.nextInt();

		int matriz[][] = new int[linhas][colunas];

		preencherMatriz(matriz);
		exibirMatriz(matriz);

		somarTodosElementos(matriz);
		somarIndiceImpar(matriz);
		multiplicarIndiceImpar(matriz);

		buscarElemento(matriz);
		somarDiagonais(matriz);
		somarLinhas(matriz);
		somarColunas(matriz);

		
	}

	private static void somarColunas(int[][] matriz) {
		int somarColunas[] = new int[matriz.length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				somarColunas[j] += matriz[i][j];
			}
		}
		for (int i = 0; i < somarColunas.length; i++) {
			System.out.println("\nSoma da coluna " + i + ": " + somarColunas[i]);
		}
	}

	private static void somarLinhas(int[][] matriz) {
		int somarLinhas[] = new int[matriz.length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				somarLinhas[i] += matriz[i][j];
			}
		}
		for (int i = 0; i < somarLinhas.length; i++) {
			System.out.println("\nSoma da linha " + i + ": " + somarLinhas[i]);
		}
	}

	private static void somarDiagonais(int[][] matriz) {
		int somaDiagonalPrincipal = 0;
		int somaDiagonalSecundaria = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == j) {
					somaDiagonalPrincipal += matriz[i][j];
				}
				if (i + j == matriz.length - 1) {
					somaDiagonalSecundaria += matriz[i][j];
				}
			}
		}
		System.out.println("\nSoma da diagonal principal: " + somaDiagonalPrincipal);
		System.out.println("Soma da diagonal secundária: " + somaDiagonalSecundaria);
	}

	private static void buscarElemento(int[][] matriz) {
		int quantidadeElementos = 0;
		System.out.print("Digite o elemento a ser buscado: ");
		int elemento = scNum.nextInt();
		Boolean elementoEncontrado = false;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == elemento) {
					System.out.print((!elementoEncontrado ? "Elemento encontrado na posição [" + i + "][" + j + "]\n" : ""));
					elementoEncontrado = true;
					quantidadeElementos++;
				}
			}
		}
		if (!elementoEncontrado) {
			System.out.println("\nElemento não encontrado!");
		}else {
			System.out.println("\nForam encontrados " + quantidadeElementos + " elementos!");
		}
	}

	private static void multiplicarIndiceImpar(int[][] matriz) {
		int multiplicacao = 1;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if ((i + j)% 2 != 0) {
					multiplicacao *= matriz[i][j];
				}
			}
		}
		System.out.println("\nMultiplicação dos elementos de índice ímpar: " + multiplicacao);
	}

	private static void somarIndiceImpar(int[][] matriz) {
		int soma = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if ((i + j )% 2 != 0) {
					soma += matriz[i][j];
				}
			}
		}
		System.out.println("\nSoma dos elementos de índice ímpar: " + soma);
	}

	private static void somarTodosElementos(int[][] matriz) {
		int soma = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				soma += matriz[i][j];
			}
		}
		System.out.println("\nSoma de todos os elementos: " + soma);
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
				System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
				matriz[i][j] = scNum.nextInt();
			}
		}
	}
}
