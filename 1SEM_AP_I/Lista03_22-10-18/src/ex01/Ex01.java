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
					caixa += filme(lugaresFilmeA--,"Filme 1");
				break;
				case 2:
					caixa += filme(lugaresFilmeB--,"Filme 2");
				break;
				case 3:
					caixa += filme(lugaresFilmeC--,"Filme 3");
				break;
				default: System.out.println("Opção inválida!");
			}
			// menu();
			System.out.println("Você deseja Continuar? (S/N)");
			encerrar = iScanner.next().toUpperCase();
		} while (!encerrar.equals("N"));
		
		System.out.print("\033[H\033[2J");  
		System.out.flush();

		System.out.println("O caixa do cinema é de: " + caixa);
		System.out.println("O operador " + operador + " - cod. " + codOperador + " encerrou o sistema.");
		iScanner.close();
	}

	private static void exibirFilmes() {
		System.out.println("Qual o filme que você deseja assistir? ");
		System.out.println("1 - Sala A: Filme 1");
		System.out.println("2 - Sala B: Filme 2");
		System.out.println("3 - Sala c: Filme 3");
	}	

	private static double filme(int lugaresSala, String Filme) {
		if (lugaresSala > 0) {
			System.out.println(Filme);
			return 10;
		} else {
			System.out.println("Lugares esgotados!");
			return 0;
		}
	}

	// Tipo do Ingresso
}


// System.out.println("Deseja continuar comprando? (S/N)");
// encerrar = iScanner.next().toUpperCase();
// }

// } while (!encerrar.equals("N"));