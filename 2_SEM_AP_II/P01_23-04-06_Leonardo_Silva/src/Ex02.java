import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		int [] [] matriz = new int [4] [4];

		preencherMatriz(matriz);
		exibirMatriz(matriz);
		int qntPares = buscarPares(matriz);

		System.out.printf("Foi encotrado %d numeros pares", qntPares);
		
	}

	private static int buscarPares(int[][] matriz) {
		int qntPares = 0 ;
		for (int i = 0; i < matriz.length; i++) {
			for (var x = 0; x < matriz[i].length; x++) {
				if (matriz[i][x] % 2 == 0) qntPares += 1;
			}
		}
		return qntPares;
	}

	private static void exibirMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (var x = 0; x < matriz[i].length; x++) {
				System.out.print(matriz[i][x] + "\t");
			}
			System.out.println();
			System.out.println();
		}
	}

	private static void preencherMatriz(int[][] matriz) {
		Random rd = new Random();
		for (int i = 0; i < matriz.length; i++) {
			for (var x = 0; x < matriz[i].length; x++) {
				matriz[i][x] = rd.nextInt(100);
			}
		}
	}

}
