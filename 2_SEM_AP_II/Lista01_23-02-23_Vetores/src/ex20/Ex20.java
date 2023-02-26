package ex20;

import ex01.Ex01;

public class Ex20 {
	public static void main(String[] args) {
		System.out.println("Vetor X: ");
		int[] vetX = Ex01.criarVetor(5);
		System.out.println("Vetor Y: ");
		int[] vetY = Ex01.criarVetor(5);

		System.out.println("Soma: ");
		exibirSoma(vetX,vetY);
		System.out.println("Produto: ");
		exibirProduto(vetX,vetY);

		System.out.println("Diferença: ");
		exibirDiferenca(vetX,vetY);

		System.out.println("Interseção: ");
		exibirIntersecao(vetX,vetY);

		System.out.println("União: ");
		exibirUniao(vetX,vetY);


	}
	private static void exibirUniao(int[] vetX, int[] vetY) {
		for(int i = 0; i < vetX.length; i++){
			System.out.printf("%d \t", vetX[i]);
		}
		for(int i = 0; i < vetY.length; i++){
			boolean tem = false;
			for(int num: vetX){
				if(vetY[i] == num){
					tem = true;
				}
			}
			if(!tem){
				System.out.printf("%d \t", vetY[i]);
			}
		}
		System.out.println();
	}
	private static void exibirIntersecao(int[] vetX, int[] vetY) {
		for(int i = 0; i < vetX.length; i++){
			for(int num: vetY){
				if(vetX[i] == num){
					System.out.printf("%d \t", vetX[i]);
				}
			}
		}
		System.out.println();
	}
	private static void exibirDiferenca(int[] vetX, int[] vetY) {
		for(int i = 0; i < vetX.length; i++){
			boolean tem = false;
			for(int num: vetY){
				if(vetX[i] == num){
					tem = true;
				}
			}
			if(!tem){
				System.out.printf("%d \t", vetX[i]);
			}
		}
		System.out.println();
	}
	private static void exibirSoma(int[] vet1, int[] vet2) {
		for(int i = 0; i < vet1.length; i++){
			System.out.printf("%d + %d = %d", vet1[i], vet2[i], (vet1[i] + vet2[i]));
			System.out.println();
		}
		System.out.println();
	}

	private static void exibirProduto(int[] vet1, int[] vet2) {
		for(int i = 0; i < vet1.length; i++){
			System.out.printf("%d * %d = %d", vet1[i], vet2[i], (vet1[i] * vet2[i]));
			System.out.println();
		}
		System.out.println();
	}
}
