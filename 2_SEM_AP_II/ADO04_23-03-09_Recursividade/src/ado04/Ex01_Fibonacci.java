package ado04;

import java.util.Scanner;

public class Ex01_Fibonacci {
	public static void main(String[] args) {
		Scanner scNum = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int n = scNum.nextInt();
		System.out.println("Fibonacci de " + n + " = " + fibonacci(n));
	}

	static int fibonacci(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
}
