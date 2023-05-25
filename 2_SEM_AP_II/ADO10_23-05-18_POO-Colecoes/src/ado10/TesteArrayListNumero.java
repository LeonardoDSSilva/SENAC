package ado10;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteArrayListNumero {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Scanner scNum = new Scanner(System.in);

		int bonus = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número: ");
			int num = scNum.nextInt();
			if (num == 10 || num == 100 || num == 1000) {
				bonus = 50;
				break;
			}
			numeros.add(num);
		}
		scNum.close();
		System.out.println(bonus>0? "Você ganhou um bônus de 50 pontos!" : "Você não ganhou bônus!");
	}
}
