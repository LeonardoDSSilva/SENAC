package ex11;

import ex01.Ex01;
import ex02.Ex02;

public class Ex11 {
	public static void main(String[] args) {
		int[] vet01 = Ex01.criarVetor(10);
		boolean[] vet02 = identificarNumeros(vet01);
		System.out.println("Vetor 1: ");
		Ex02.exibirVetor(vet01);
		exibirVetorBool(vet02);
	}

	private static boolean[] identificarNumeros(int[] vetor) {
		boolean[] vet = new boolean[vetor.length];
		for(int i = 0; i < vet.length; i ++){
			if (vetor[i]%2 == 0){
				vet[i] = true;
			}
			else{
				vet[i] = false;
			}
		}
		return vet;
	}
	public static void exibirVetorBool(boolean[] vet02) {
		for (int i = 0; i < vet02.length; i++) {
		  System.out.print( vet02[i] +"\t" );
		}
		System.out.println();
	}
}
