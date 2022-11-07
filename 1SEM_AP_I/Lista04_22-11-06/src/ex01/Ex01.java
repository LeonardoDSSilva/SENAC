package ex01;

import java.util.Scanner;

public class Ex01 {

  public static void main(String[] args) {
    double[] num = new double[8];
    Scanner numScanner = new Scanner(System.in);

    for (int i = 0; i < num.length; i++) {
      System.out.printf("Digite o %dº número: ", i + 1);
      num[i] = numScanner.nextDouble();
    }
	exibirMedia(num);
  }
  public static void exibirMedia(double[] num) {
	double soma = 0;
	for (int i = 0; i < num.length; i++) {
		soma += num[i];
	}
	System.out.println("A media dos números é: " + (soma / num.length));
	}
}
