package ex04;

import java.util.Random;

public class Ex04 {

	public static void main(String[] args) {
		int[] nums01 = new int[20];
		int[] nums02 = new int[20];

		Random numRandom = new Random();

		for (int i = 0; i < 20; i++) {
			nums01[i] = numRandom.nextInt(50);
			nums02[i] = numRandom.nextInt(50);
		}
		exibirVetor(nums01, nums02);
		verficaIguais(nums01, nums02);
	}

	private static void verficaIguais(int[] nums01, int[] nums02) {
		int[] numsIguais = new int[20];
		int cont = 0;
		for (int i = 0; i < nums01.length; i++) {
			for (int j = 0; j < nums02.length; j++) {
				if (nums01[i] == nums02[j]) {
					numsIguais[cont] = nums01[i];
					cont++;
				}
		}
	}
	System.out.println();
	System.out.println();
	System.out.println("Os números iguais são: ");
	for (int i = 0; i < numsIguais.length; i++) {
		if (numsIguais[i] != 0) {
		System.out.print(numsIguais[i] + " ");
		}
	}
	}

  private static void exibirVetor(int[] nums01, int[] nums02) {
    for (int num : nums01) {
      System.out.print(num + " ");
    }
    System.out.println();
    for (int num : nums02) {
      System.out.print(num + " ");
    }
  }
}
