package ex02;

import java.util.Scanner;

public class Ex02 {

  public static void main(String[] args) {
    double[] num = new double[10];
    Scanner numScanner = new Scanner(System.in);

    for (int i = 0; i < num.length; i++) {
      System.out.printf("Digite o %dº número: ", i + 1);
      num[i] = numScanner.nextDouble();
    }
	exibirPar(num);
  }

  public static void exibirPar(double[] num) {
    for (int i = 0; i < num.length; i++) {
      if (num[i] % 2 == 0) {
        System.out.println("Indice: " + i + " Valor: " + num[i]);
      }
    }
  }
}
