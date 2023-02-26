package ex06;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		double[] vet1 = lerNotas(20);
		double media = calcularMedia(vet1);
		System.out.printf("A media dos valores informardo foi de: %.2f", media);
		System.out.println("\nValores abaixo da media: ");
		exibirValoresAbaixodaMedia(vet1,media);
	}

	private static void exibirValoresAbaixodaMedia(double[] vet1, double media) {
		for (double num : vet1){
			if(num < media){
				System.out.print(num + "\t");
			}
		}
	}

	private static double calcularMedia(double[] vet1) {
		double somatoria =0 ;
		for(double num: vet1){
			somatoria += num;
		}
		return (somatoria/vet1.length);
	}

	private static double[] lerNotas(int tamVetor) {
		Scanner scNum = new Scanner(System.in);
		double[] vetor = new double[tamVetor];
		for (int i = 0; i < vetor.length; i++){
			System.out.printf("Informe a %dª numero: ", i +1);
			vetor[i] = scNum.nextDouble();
		}
		System.out.println();
		return vetor;
	}
}
