package ex03;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {

  public static void main(String[] args) {
    int[] num = new int[6];
    Scanner numScanner = new Scanner(System.in);
    Random numRandom = new Random();

    for (int i = 0; i < num.length; i++) {
      num[i] = numRandom.nextInt(10);
    }
    // exibirVetor(num);
    buscarElemento(num);
  }

  private static void exibirVetor(int[] nums) {
	for (int num : nums) {
		System.out.println(num);
	}
  }
	public static void buscarElemento(int[] nums) {
		boolean achou = false;
		Scanner numScanner = new Scanner(System.in);
		System.out.print("Digite um número: ");

		int numBusca = numScanner.nextInt();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == numBusca) {
				System.out.println("O número " + numBusca + " está no índice " + i);
				achou = true;
			}
		}
		System.out.println((!achou) ? ("O número " + numBusca + " não está no vetor "):"");
	}
}
