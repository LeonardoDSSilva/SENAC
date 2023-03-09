package ex01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scNum = new Scanner(System.in);
		int num01, num02, maior;

		System.out.print("Digite o primeiro numero: ");
		num01 = scNum.nextInt();
		System.out.print("Digite o segundo numero: ");
		num02 = scNum.nextInt();

		maior = encontrarMaior(num01, num02);

		System.out.println("O maior numero é: " + maior );
		
	}
	private static int encontrarMaior(int num01, int num02) {
		if (num01 > num02) {
			return num01;
		} else {
			return num02;
		}
	}
}
