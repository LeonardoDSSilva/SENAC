import java.util.Scanner;

public class Lista01 {
	public static void main(String[] args) {
		Scanner scNum = new Scanner(System.in);
		Scanner scStr = new Scanner(System.in);
		
		limparTela(); // Só funciona com o Git Bash instalado
		do{
			System.out.println("1_ Ex01: Criar Vetor");
			System.out.println("2_ Ex02: Exibir Vetor");
			System.out.println("3_ Ex03: Exibir  Maior Valor e sua Posicao");
			System.out.println("4_ Ex04: Copiar Vetor");
			System.out.println("5_ Ex05: Inverter Vetor");
			System.out.println("6_ Ex06: Exibir Menores Valores abaixo da Media");
			System.out.println("7_ Ex07: Exibir Maior Valor");
			System.out.println("8_ Ex08: Ler Vetor somente com Pares e Inverter");
			System.out.println("9_ Ex09: Buscar Valor");
			System.out.println("10_ Ex10: Exibir Quantidade de Valores Negativos");
			System.out.println("11_ Ex11: Exibir Vetor Booleano de Acordo se é Par ou Impar");
			System.out.println("12_ Ex12: Exibir Soma dos Elementos A[0], A[1] e A[5] do Vetor, e Alterar o Valor de A[4]");
			System.out.println("13_ Ex13: Exibir Vetor Quadrado de Vetor Informado");
			System.out.println("14_ Ex14: Exibir Quantidade de Pares");
			System.out.println("15_ Ex15: Leias 5 Salarios e Calcular Reajuste de 10% se for Menor que 1000");
			System.out.println("16_ Ex16: Ler Vetor com numeros reais e Exibir a Media");
			System.out.println("17_ Ex17: Ler Vetor com numeros difentes do que o anterior");
			System.out.println("18_ Ex18: Informar quantidades de Alunos e suas Notas, e Exibir a Media");
			System.out.println("19_ Ex19: Ler 2 Vetores e Exibir a Soma, Subtracao, Multiplicacao e Divisao");
			System.out.println("20_ Ex20: Ler 2 Vetores e Exibir a Soma, Produto, Diferenca, Intersecao e Uniao");

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
			case 11:
				ex11.Ex11.main(args);
				break;
			case 12:
				ex12.Ex12.main(args);
				break;
			case 13:
				ex13.Ex13.main(args);
				break;
			case 14:
				ex14.Ex14.main(args);
				break;
			case 15:
				ex15.Ex15.main(args);
				break;
			case 16:
				ex16.Ex16.main(args);
				break;
			case 17:	
				ex17.Ex17.main(args);
				break;
			case 18:
				ex18.Ex18.main(args);
				break;
			case 19:
				ex19.Ex19.main(args);
				break;
			case 20:
				ex20.Ex20.main(args);
				break;
			default:
				System.out.println("Exercício não encontrado!");
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
