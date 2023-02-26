package ex04;
import ex01.Ex01;
import ex02.Ex02;

public class Ex04 {
	public static void main(String[] args) {
		int [] vet1 = Ex01.criarVetor(5);
		int [] vet2 = vet1;

		System.out.println("Vetor 1: ");
		Ex02.exibirVetor(vet1);
		System.out.println("Vetor 2: ");
		Ex02.exibirVetor(vet2);
	}
}
