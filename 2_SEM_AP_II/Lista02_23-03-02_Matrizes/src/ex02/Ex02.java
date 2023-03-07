package ex02;

import java.util.Random;

import javax.print.DocFlavor.STRING;

public class Ex02 {
	public static void main(String[] args) {
		int matriz[][] = new int[2][5];

		preencherMatriz(matriz);
		verificarElementosRepetidos(matriz);
		exibirMatriz(matriz);
		
	}

	private static void verificarElementosRepetidos(int[][] matriz) {
		Boolean repetido = false;
		String elementosRepetidos = "";
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				for (int k = 0; k < matriz.length; k++) {
					for (int l = 0; l < matriz[k].length; l++) {
						if (matriz[i][j] == matriz[k][l] && i != k && j != l) {
							repetido = true;
							elementosRepetidos += matriz[i][j] + " ";
						}
					}
				}
			}
		}
		if (repetido) {
			System.out.println("Há elementos repetidos na matriz: " + elementosRepetidos);
		} else {
			System.out.println("Não há elementos repetidos na matriz");
		}
		System.out.println();
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
