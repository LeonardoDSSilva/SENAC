import java.util.Scanner;

public class Lista02 {
	public static void main(String[] args) {
		Scanner scNum = new Scanner(System.in);
		Scanner scStr = new Scanner(System.in);

		String continuar = "";
		
		limparTela(); // Só funciona com o Git Bash instalado

		do {
			System.out.println("1_Ex01: Constrir uma matriz 2x5 e preencher com números sequenciais de 1 a 10.");
			System.out.println("2_Ex02: Dada uma matriz verificar se não há números repetidos.");
			System.out.println("3_Ex03: Dada uma matriz, criar um vetor com a soma dos elementos de cada linha");
			System.out.println("4_Ex04: Subtrair duas matrizes");
			System.out.println("5_Ex05: Produto de duas matrizes");
			System.out.println("6_Ex06: Encontrar o menor elemento de uma matriz");
			System.out.println("7_Ex07: Encontrar o maior elemento de uma matriz e sua posição");
			System.out.println("8_Ex08: Verificar se uma matriz é um quadrado mágico");
			System.out.println("9_Ex09: Construir uma matriz, e soma ...");
			System.out.println("10_Ex10: Construir uma matriz ");


			System.out.print("Informe o número do exercício que deseja executar: ");
			int ex = scNum.nextInt();

			limparTela(); // Só funciona com o Git Bash instalado

			switch (ex) {
			case 1:
				ex01.Ex01.main(args);
				break;
			case 2:
				ex02.Ex02.main(args);
				break;
			case 3:
				ex03.Ex03.main(args);
				break;
			case 4:
				ex04.Ex04.main(args);
				break;
			case 5:
				ex05.Ex05.main(args);
				break;
			case 6:
				ex06.Ex06.main(args);
				break;
			case 7:
				ex07.Ex07.main(args);
				break;
			case 8:
				ex08.Ex08.main(args);
				break;	
			case 9:
				ex09.Ex09.main(args);
				break;
			case 10:
				ex10.Ex10.main(args);
				break;
			default:
				System.out.println("Exercício não encontrado!");
				break;
			}

			System.out.println("Deseja executar outro exercício? (S/N)");
			continuar = scStr.nextLine().toUpperCase();

		} while (continuar.equals("S"));
	}
	
	private static void limparTela() {
		System.out.print("\033[H\033[2J");  
		System.out.flush();
	}

}

