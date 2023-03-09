package ex02;

import java.util.Scanner;

import javax.xml.transform.SourceLocator;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scNum = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num01 = scNum.nextInt();

		String tipo = indentificarTipo(num01);

		System.out.print("O numero " + num01 + " é " + tipo);

	}
	
	private static String indentificarTipo(int num01) {
		if (num01 % 2 == 0) {
			return "Par";
		} else {
			return "Impar";
		}
	}
}
