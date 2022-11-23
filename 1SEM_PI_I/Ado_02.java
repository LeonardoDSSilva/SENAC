import java.util.Scanner;
import java.util.Random;

public class Ado_02 {
	public static void main(String[] args) {
		System.out.println("### Cara ou Coroa ###");
		int vitorias = 0, contador = 0;
		Scanner iScanner = new Scanner(System.in);
		Random rand = new Random();

		do{
			System.out.print("\033[H\033[2J");
			System.out.flush();

			System.out.println("O que você escolhe?");
			System.out.println("  0 - Cara");
			System.out.println("  1 - Coroa");
			System.out.print("-> ");

			int computador = rand.nextInt(2);

			int usuario = iScanner.nextInt();
			if (usuario >= 0 && usuario <= 1) {
				if (usuario == computador){
					vitorias += 1;
				}
				contador += 1;
			}
		} while (contador < 5);

		System.out.println("Você ganhou " + vitorias + " vezes de 5 jogadas");
	}
}
