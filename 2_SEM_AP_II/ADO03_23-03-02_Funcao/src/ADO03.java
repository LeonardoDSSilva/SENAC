import java.util.Scanner;

import ex01.Ex01;
import ex02.Ex02;
import ex03.Ex03;

public class ADO03 {
	public static void main(String[] args) {
		Scanner scNum = new Scanner(System.in);
		Scanner scStr = new Scanner(System.in);

		limparTela();

		do{
			System.out.println("1_Ex01: Função que identifica o maior numero");
			System.out.println("2_Ex02: Função que identifica se um numero é par ou impar");
			System.out.println("3_Ex03: Função que calcula de acordo com o numero digitado");

			System.out.print("Digite o numero do exercicio que deseja executar: ");
			int numEx = scNum.nextInt();

			limparTela();

			switch (numEx) {
				case 1:
					Ex01.main(args);
					break;
				case 2:
					Ex02.main(args);
					break;
				case 3:
					Ex03.main(args);
					break;
				default:
					System.out.println("Opção invalida");
					break;
			}
			System.out.print("Deseja executar outro exercicio? (S/N): ");
		} while (scStr.nextLine().toUpperCase().equals("S"));
		limparTela();
	}

	private static void limparTela() {
		System.out.print("\033[H\033[2J");  
        System.out.flush();
	}
}
