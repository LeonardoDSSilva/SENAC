package ex01;

public class Ex01 {
	public static void main(String[] args) {
		int matriz[][] = new int[2][6];

		preencherMatriz(matriz);
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
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (j + 1) + (matriz[i].length * i);
			}
		}
	}

}
