package ex19;

import ex01.Ex01;

public class Ex19 {
	public static void main(String[] args) {
		int[] vet1 = Ex01.criarVetor(5);
		int[] vet2 = Ex01.criarVetor(5);

		System.out.println("Soma: ");
		exibirSoma(vet1,vet2);
		System.out.println("Subtração: ");
		exibirSubtracao(vet1,vet2);
		System.out.println("Multiplicação: ");
		exibirMultiplicacao(vet1,vet2);
		System.out.println("Divisão: ");
		exibirDivisao(vet1,vet2);
		
	}

	private static void exibirSoma(int[] vet1, int[] vet2) {
		for(int i = 0; i < vet1.length; i++){
			System.out.printf("%d + %d = %d", vet1[i], vet2[i], (vet1[i] + vet2[i]));
			System.out.println();
		}
		System.out.println();
	}

	private static void exibirSubtracao(int[] vet1, int[] vet2) {
		for(int i = 0; i < vet1.length; i++){
			System.out.printf("%d - %d = %d", vet1[i], vet2[i], (vet1[i] - vet2[i]));
			System.out.println();
		}
		System.out.println();
	}

	private static void exibirMultiplicacao(int[] vet1, int[] vet2) {
		for(int i = 0; i < vet1.length; i++){
			System.out.printf("%d * %d = %d", vet1[i], vet2[i], (vet1[i] * vet2[i]));
			System.out.println();
		}
		System.out.println();
	}
	private static void exibirDivisao(int[] vet1, int[] vet2) {
		for(int i = 0; i < vet1.length; i++){
			if(vet2[i] == 0){
				System.out.printf("%d / %d = %s", vet1[i], vet2[i], "Não é possível dividir por 0");
				System.out.println();
			}
			else{
				System.out.printf("%d / %d = %d", vet1[i], vet2[i], (vet1[i] / vet2[i]));
				System.out.println();
			}
		}
		System.out.println();
	}
}
