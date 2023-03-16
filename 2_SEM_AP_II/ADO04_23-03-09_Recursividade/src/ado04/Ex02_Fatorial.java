package ado04;

import java.util.Scanner;

public class Ex02_Fatorial {
	public static void main(String[] args) {
		Scanner scNum = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int n = scNum.nextInt();
		System.out.println("Fatorial de " + n + " = " + fatorial(n));
		
	}
	static int fatorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * fatorial(n - 1);
		}
	}
}
