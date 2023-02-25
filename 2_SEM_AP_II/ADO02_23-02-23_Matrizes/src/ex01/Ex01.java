package ex01;

public class Ex01 {
	public static void main(String[] args) {
		int linha = 3, coluna = 3;
		int[] [] matriz01 = new int[linha] [coluna];
		int[] [] matriz02 = new int[linha] [coluna];
		int[] [] matriz03 = new int[linha] [coluna];

		preencherMatriz(matriz01);
		preencherMatriz(matriz02);
		System.out.println("Matriz 01: ");
		exibirMatriz(matriz01);
		System.out.println();
		System.out.println("Matriz 02: ");
		exibirMatriz(matriz02);
		System.out.println();
		matriz03 = somarMatriz(matriz01, matriz02);
		System.out.println("(Soma das Matrizes 01 e 02): ");
		exibirMatriz(matriz03);
		System.out.println();
		System.out.println("Matriz 01: ");
		exibirMatriz(matriz01);
		System.out.println();
		System.out.println("Matriz 02: ");
		exibirMatriz(matriz02);
		System.out.println();
	}

	public static void preencherMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * 10);
			}
		}
	}

	public static void exibirMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}

	public static int[][] somarMatriz(int[][] matriz01, int[][] matriz02) {
		int[][] matriz03 = new int[matriz01.length] [matriz01[0].length];
		for (int i = 0; i < matriz01.length; i++) {
			for (int j = 0; j < matriz01[i].length; j++) {
				matriz03[i][j] = matriz01[i][j] + matriz02[i][j];
			}
		}
		return matriz03;
	}
}
