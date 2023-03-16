import java.util.Scanner;
import ado04.*;

public class ADO04 {
	public static void main(String[] args) {
		Scanner scNum = new Scanner(System.in);
		Scanner scStr = new Scanner(System.in);
		do{

			limparTela();
			System.out.println("1_Ex01: Fibonacci");
			System.out.println("2_Ex02: Fatorial");

			System.out.print("Digite o numero do exercicio que deseja executar: ");
			int numEx = scNum.nextInt();

			limparTela();

			switch (numEx) {
				case 1:
					Ex01_Fibonacci.main(args);
					break;
				case 2:
					Ex02_Fatorial.main(args);
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
