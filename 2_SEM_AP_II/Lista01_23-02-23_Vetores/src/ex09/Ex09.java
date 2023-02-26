package ex09;
import java.util.Scanner;

import ex01.Ex01;

public class Ex09 {
	public static void main(String[] args) {
		int[] vetor = Ex01.criarVetor(10);
		buscarElemento(vetor);
	}

	private static void buscarElemento(int[] vetor) {
		boolean naoEncontrado = true;
		Scanner scNum = new Scanner(System.in);
		System.out.println("Qual o numero que deseja encontra: ");
		int num = scNum.nextInt();

		for(int i = 0; i < vetor.length; i++){
			if(vetor[i] == num){
				System.out.printf("O numero %d esta na posicao %d do vetor\n", num, i);
				naoEncontrado = false;
			}
		}
		if(naoEncontrado) System.out.println("O numero " +num+", não foi encontrado");
	}
}
