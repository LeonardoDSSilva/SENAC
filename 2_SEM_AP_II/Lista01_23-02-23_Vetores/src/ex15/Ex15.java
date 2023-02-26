package ex15;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		double[] salarios = new double[5];
		lerSalarios(salarios);
		
		System.out.println("Salarios: ");
		exibirVetor(salarios);
		calcularReajuste(salarios);
		System.out.println("Salarios Reajustado: ");
		exibirVetor(salarios);
	}

	private static void calcularReajuste(double[] salarios) {
		for(int i = 0; i < salarios.length; i++){
			if(salarios[i] < 1000) salarios[i] = (salarios[i] * 1.1);
		}
	}

	public static void exibirVetor(double[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
		  System.out.printf("%.2f \t", vetor[i]);
		}
		System.out.println();
	}

	private static void lerSalarios(double[] salarios) {
		Scanner scNum = new Scanner(System.in);
		for(int i = 0; i < salarios.length; i++){
			System.out.printf("Informe a %dª valor: ", i +1);
			salarios[i] = scNum.nextDouble();
		}
	}
}
