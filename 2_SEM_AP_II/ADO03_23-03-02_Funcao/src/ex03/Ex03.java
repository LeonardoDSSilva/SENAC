package ex03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scNum = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num = scNum.nextInt();

		double resultado = calcularFuncao(num);

		System.out.print("O resultado da função é: " + resultado);
	}

	private static double calcularFuncao(int num) {
		int resultado = 0;
		if (num < -1){
			resultado = Math.abs(num + 2);
		} else if (num >= -1 && num <= 2) {
			resultado = (int) Math.pow(num, 2) - 4;
		} else {
			resultado = (2 * num) - 1;
		}
		return resultado;
	}

}
