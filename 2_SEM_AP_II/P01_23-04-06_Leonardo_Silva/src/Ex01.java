import java.util.Scanner;

public class Ex01 {
	static Scanner scInt = new Scanner(System.in);
	public static void main(String[] args) {
		int [] vetor = new int[5];
		preencherVetor(vetor);

		System.out.println("Vetor: ");
		exibirVetor(vetor);

		System.out.println("Informe um numero a ser procurado: ");
		int num = scInt.nextInt();

		int retorno = buscarLinear(vetor, num);

		System.out.println( retorno == -1? "O numero "+ num + " nao foi encontrado": ("O numero " + num + " esta na posicao " + retorno + " do vetor"));
	}

	private static void exibirVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + "\t");
		}
		System.out.println();
	}

	private static int buscarLinear(int[] vetor, int num) {
		for (int i = 0; i < vetor.length; i++) {
			if (num == vetor[i]) {
				return i;
			}
		}
		return -1;
	}

	private static void preencherVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite o %d° numero: ", i + 1);
			vetor[i] = scInt.nextInt();
		}
	}
}
