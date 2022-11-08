package exm_01;

public class Linhas {
	int coluna;
	int linha;
	int[][] matriz;

	public Linhas(int totalLinhas, int totalColunas) {
		linha = totalLinhas;
		coluna = totalColunas;
		matriz = new int[linha][coluna];
	}

	public void Imprimir() {
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.print(matriz[linha][coluna] + " ");
			}
			System.out.println();
		}
	}
	
}
