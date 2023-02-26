package ex18;

import java.util.Scanner;

public class Ex18 {
	static Scanner scNum = new Scanner(System.in);
	static Scanner scStr = new Scanner(System.in);
	public static void main(String[] args) {


		int tam;
		System.out.print("Informe a quantidade de alunos: ");
		tam = scNum.nextInt();

		String[] nomes = new String[tam];
		double[] p1 = new double[tam];
		double[] p2 = new double[tam];
		double[] media = new double[tam];

		preencherVetores(nomes, p1, p2, media);
		exibirVetores(nomes, p1, p2, media);

	}

	private static void exibirVetores(String[] nomes, double[] p1, double[] p2, double[] media) {
		for(int i = 0; i < p1.length; i++){
			System.out.println("Nome: " + nomes[i]);
			System.out.println("  Prova01: " + p1[i]);
			System.out.println("  Prova02: " + p2[i]);
			System.out.println(" Media: " + media[i]);
			System.out.println();
		}
	}

	private static void preencherVetores(String[] nomes, double[] p1, double[] p2, double[] media) {
		for(int i = 0; i < p1.length; i++){
			System.out.printf("Informe o nome do Aluno %d: ", i +1);
			nomes[i] = scStr.nextLine();

			System.out.print("Informe a nota da Prova01: ");
			p1[i] = scNum.nextDouble();

			System.out.print("Informe a nota da Prova02: ");
			p2[i] = scNum.nextDouble();

			media[i]= (p1[i] + p2[i])/2;
		}
	}
}
