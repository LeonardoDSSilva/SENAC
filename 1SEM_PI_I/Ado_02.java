import java.util.Scanner;
import java.util.Random;

public class Ado_02 {
	public static void main(String[] args) {
		limparTela();
		System.out.println("### Cara ou Coroa ###");
		int vitorias = 0, contador = 0, computador, usuario;
		Scanner iScanner = new Scanner(System.in);
		Random rand = new Random();
		temporizador();

		do{
			limparTela();
			System.out.println( " " + (contador+1) + "ª tentativa de 5");
			System.out.println("  O que você escolhe?");
			System.out.println("    0 - Cara");
			System.out.println("    1 - Coroa");
			System.out.print("-> ");
			usuario = iScanner.nextInt();

			computador = rand.nextInt(2);
			if (usuario >= 0 && usuario <= 1) {
				if (usuario == computador){
					vitorias += 1;
				}
				contador += 1;
				System.out.println("\n  Deu " + (computador == 0 ? "Cara" : "Coroa"));
				System.out.println((usuario == computador ? "  Você ganhou !!" : "  Não foi dessa vez !"));
				temporizador();
			}
		} while (contador < 5);
		limparTela();
		System.out.println("Você ganhou " + vitorias + " vezes de 5 jogadas");
	}
	public static void temporizador() {
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void limparTela() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}