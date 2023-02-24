package ex02;
import ex01.Ex01;

public class ex02 {
	public static void main(String[] args) {
		int[] vetor = Ex01.criarVetor(10);
		exibirVetor(vetor);
	}
	
	private static void exibirVetor(int[] vetor) {
		System.out.println("Vetor: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%d \t", vetor[i]);
		}
		System.out.println();
	}


}
