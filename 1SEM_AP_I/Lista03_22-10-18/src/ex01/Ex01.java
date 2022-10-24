package ex01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		String operador, encerrar;
		int codOperador, lugaresFilmeA = 2, lugaresFilmeB = 5, lugaresFilmeC = 3;
		double caixa = 0;


		Scanner iScanner = new Scanner(System.in);

		System.out.println("Informe o seu nome: ");
		operador = iScanner.nextLine();

		System.out.println("Informe o seu código: ");
		codOperador = iScanner.nextInt();

		do {

			exibirFilmes();
	
			int filme = iScanner.nextInt();
	
			switch (filme) {
				case 1:
					if (lugaresFilmeA > 0) {
						System.out.println("Filme A");
						lugaresFilmeA--;
						caixa += 10;
					} else {
						System.out.println("Filme A lotado");
					}
				break;
				case 2:
					if (lugaresFilmeB > 0) {
						System.out.println("Filme B");
						lugaresFilmeB--;
						caixa += 15;
					} else {
						System.out.println("Filme B lotado");
					}
				break;
				case 3:
					if (lugaresFilmeC > 0) {
						System.out.println("Filme C");
						lugaresFilmeC--;
						caixa += 20;
					} else {
						System.out.println("Filme C lotado");
					}
				break;
				default: System.out.println("Opção inválida!");
			}
			// menu();
			System.out.println("Você deseja Continuar? (S/N)");
			encerrar = iScanner.next().toUpperCase();
		} while (!(encerrar.equalsIgnoreCase("S")));

		System.out.println("Obrigado por utilizar o nosso sistema!");
		System.out.println("O caixa do cinema é de: " + caixa);
		System.out.println("O operador " + operador + " com o código " + codOperador + " encerrou o sistema.");

	}

	private static void exibirFilmes() {
		System.out.println("Qual o filme que você deseja assistir? ");
		System.out.println("1 - Filme A");
		System.out.println("2 - Filme B");
		System.out.println("3 - Filme C");
	}	

	private static double filmeA(int lugaresFilmeA) {
		return 0;
	}

	private static double filmeC(int lugaresFilmeC) {
		return 0;
	}

	private static double filmeB(int lugaresFilmeB) {
			if (lugaresFilmeB > 0) {
				System.out.println("Filme B");
				lugaresFilmeB--;
				return 10;
			} else {
				System.out.println("Filme B");
				System.out.println("Lugares esgotados!");
				return 0;
			}
	}
}
