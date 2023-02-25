import java.util.Scanner;

import ex01.Ex01;
import ex02.Ex02;
import ex03.Ex03;
import ex04.Ex04;

public class ADO02 {
	public static void main(String[] args) {
		Scanner scNum = new Scanner(System.in);
		Scanner scStr = new Scanner(System.in);

		limparTela(); // Só funciona com o Git Bash instalado

		do{
			System.out.println("1_Ex01: Soma entre duas matrizes Quadradas");
			System.out.println("2_Ex02: Matriz Transposta");
			System.out.println("3_Ex03: Soma de todos os elementos da matriz");
			System.out.println("4_Ex04: Soma dos elementos que estão abaixo da diagonal principal");

			System.out.print("Informe o número do exercício que deseja executar: ");
			int ex = scNum.nextInt();

			limparTela(); // Só funciona com o Git Bash instalado

			switch (ex) {
				case 1:
					Ex01.main(args);
					break;
				case 2:
					Ex02.main(args);
					break;
				case 3:
					Ex03.main(args);
					break;
				case 4:
					Ex04.main(args);
					break;
				default:
					System.out.println("Exercício inválido, tente novamente!");
					break;
			}
			System.out.println("Deseja executar outro exercício? (S/N)");
		} while (scStr.nextLine().toUpperCase().equals("S"));
	}

	private static void limparTela() {
		System.out.print("\033[H\033[2J");  
        System.out.flush();
	}
}
