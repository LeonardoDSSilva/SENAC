package ex13;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		double[] vet01 = new double[10];
		lerVetor(vet01);
		double[] vet02 = calcularQuadrado(vet01);

		System.out.println("Vetor: ");
		exibirVetor(vet01);
		System.out.println("Vetor Quadrado: ");
		exibirVetor(vet02);
	}

	private static double[] calcularQuadrado(double[] vetor) {
		double[] vetorQuadrado = new double[vetor.length];
		for(int i = 0; i < vetor.length; i++){
			vetorQuadrado[i] = (vetor[i] * vetor[i]);
		}
		return vetorQuadrado;
	}

	private static void lerVetor(double[] vetor) {
		Scanner scNum = new Scanner(System.in);
		for(int i = 0; i < vetor.length; i++){
			System.out.printf("Informe a %dª valor: ", i +1);
			vetor[i] = scNum.nextDouble();
		}
		scNum.close();
	}

	public static void exibirVetor(double[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
		  System.out.printf("%.2f \t", vetor[i]);
		}
		System.out.println();
	}
}
