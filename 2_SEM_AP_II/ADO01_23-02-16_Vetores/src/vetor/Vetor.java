package vetor;

import java.util.Random;
import java.util.Scanner;

public class Vetor {
	static Scanner sc_Num = new Scanner(System.in);
	static Scanner sc_Str = new Scanner(System.in);
	public static void main(String[] args) {
		int n = 5;
		int[] vetor = new int[n];
		vetor = carregarVetorNumerosAleatorios(vetor);

		do{
			System.out.println("Vetor: ");
			exibirVetor(vetor);

			System.out.println("1 - Somar elementos pares");
			System.out.println("2 - Somar elementos impares");
			System.out.println("3 - Buscar elemento");
			System.out.println("4 - Encontrar maior elemento");
			System.out.println("5 - Encontrar menor elemento");
			System.out.println("6 - Multiplicar elementos por um numero");
			
			System.out.print("Informe a opcao desejada: ");
			int opcao = sc_Num.nextInt();
	
			switch (opcao) {
				case 1:
					somarElementosVetores(vetor, 1);
				break;
				case 2:
					somarElementosVetores(vetor, 2);
				break;
				case 3:
					buscarElementosVetor(vetor);
				break;
				case 4:
					encontrarMaiorElementoVetor(vetor);
				break;
				case 5:
					encontrarMenorElementoVetor(vetor);
				break;
				case 6:
					vetor = multiplicarElementosVetor(vetor);
					exibirVetor(vetor);
				break;
				default:
					System.out.println("Opcao invalida, tente novamente !!!");
				break;
			}
		System.out.println("Deseja continuar? (S/N)");
		} while(sc_Str.next().toUpperCase().equalsIgnoreCase("S"));
	}

	public static void exibirVetor(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.print("\t" + v[i]);
		}
		System.out.println();
		System.out.println();
	}

	public static int[] carregarVetorNumerosAleatorios(int[] vetor) {
		Random ram = new Random();
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = ram.nextInt(100);
		}
		return vetor;
	}

	public static void somarElementosVetores(int[] vetor, int opcao) {
		int somaPares = 0, somaImpares = 0;
		for (int i : vetor) {
			if(i%2==0){
				somaPares += i;
			}
			else{
				somaImpares += i;
			}
		}
		if(opcao == 1){
			System.out.println("A somatoria dos elementos pares: " + somaPares);
		}
		else {
			System.out.println("A somatoria dos elementos impares: " + somaImpares);
		}
	}

	public static void buscarElementosVetor(int[] vetor){
		boolean naoEncontrado = true;
		System.out.println("Informe o numero que vc desejar encontar");
		int numero = sc_Num.nextInt();

		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] == numero){
				System.out.printf("O numero %d esta na posicao %d do vetor\n", numero, i);
				naoEncontrado = false;
			}
		}
		if(naoEncontrado){
			System.out.println("O numero não foi encontrado");
		}
	}

	public static void encontrarMaiorElementoVetor(int[] vetor){
		int maior = 0;
		for (int i : vetor) {
			if(i > maior){
				maior = i;
			}
		}
		System.out.println("O maior elemento do vetor é: " + maior);
	}

	public static void encontrarMenorElementoVetor(int[] vetor){
		int menor = 0;
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] < menor){
				menor = vetor[i];
			}
		}
		System.out.println("O menor elemento do vetor é: " + menor);
	}

	public static int[] multiplicarElementosVetor(int[] vetor){
		System.out.print("Informe o numero que vc desejar multiplicar: ");
		int numero = sc_Num.nextInt();
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] *= numero;
		}
		return vetor;
	}
}