package ex01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		String operador, encerrar;
		int codOperador, lugaresFilmeA = 30, lugaresFilmeB = 35, lugaresFilmeC = 55;
		double caixa = 0;

		System.out.print("\033[H\033[2J");  
		System.out.flush();
		
		Scanner iScanner = new Scanner(System.in);
		
		System.out.println("Informe o seu nome: ");
		operador = iScanner.nextLine();

		System.out.println("Informe o seu código: ");
		codOperador = iScanner.nextInt();

		do {

			System.out.print("\033[H\033[2J");  
			System.out.flush();
			
			exibirFilmes();
			int filme = iScanner.nextInt();
			
			switch (filme) {
				case 1:
					caixa += filmeA(lugaresFilmeA--);
				break;
				case 2:
					caixa += filmeB(lugaresFilmeB--);
				break;
				case 3:
					caixa += filmeC(lugaresFilmeC--);
				break;
				default: System.out.println("Opção inválida!");
			}
			// menu();
			System.out.println("Você deseja Continuar? (S/N)");
			encerrar = iScanner.next().toUpperCase();
		} while (!(encerrar.equalsIgnoreCase("S")));
		
		System.out.print("\033[H\033[2J");  
		System.out.flush();

		System.out.println("O caixa do cinema é de: " + caixa);
		System.out.println("O operador " + operador + " - cod. " + codOperador + " encerrou o sistema.");
	}

	private static void exibirFilmes() {
		System.out.println("Qual o filme que você deseja assistir? ");
		System.out.println("1 - Sala A: Filme 1");
		System.out.println("2 - Sala B: Filme 2");
		System.out.println("3 - Sala c: Filme 3");
	}	

	private static double filmeA(int lugaresFilmeA) {
		if (lugaresFilmeA > 0) {
			System.out.println("Filme A");
			return 10;
		} else {
			System.out.println("Filme A");
			System.out.println("Lugares esgotados!");
			return 0;
		}
	}

	private static double filmeB(int lugaresFilmeB) {
		if (lugaresFilmeB > 0) {
			System.out.println("Filme B");
			return 10;
		} else {
			System.out.println("Filme B");
			System.out.println("Lugares esgotados!");
			return 0;
		}
	}

	private static double filmeC(int lugaresFilmeC) {
		if (lugaresFilmeC > 0) {
			System.out.println("Filme C");
			return 10;
		} else {
			System.out.println("Filme C");
			System.out.println("Lugares esgotados!");
			return 0;
		}
	}

	// Tipo do Ingresso
}
