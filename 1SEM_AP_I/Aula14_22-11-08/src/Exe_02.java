import java.util.Scanner;

public class Exe_02 {

	public static void main(String[] args) {
	int[] vetor = { 1, 30, 27, 65, 64, 21, 52, 89, 2, 68 };

	buscarElemento(vetor);
	}

	private static void buscarElemento(int[] vetor) {
		Scanner scanner = new Scanner(System.in);
		int cont = 0;

		System.out.println("Digite um número: ");
		int numero = scanner.nextInt();

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numero) {
				System.out.println("O número " + numero + " está na posição " + i);
				cont = 1;
			}
		}
		if (cont == 0) {
			System.out.println("O número " + numero + " não está no vetor");
		}
	}
}
