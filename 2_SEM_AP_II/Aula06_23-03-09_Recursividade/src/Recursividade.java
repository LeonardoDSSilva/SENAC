import java.util.Scanner;

public class Recursividade {
	public static void main(String[] args) {
		Scanner scNum = new Scanner(System.in);
		System.out.print("Digite um número para soma recursiva: ");
		int num = scNum.nextInt();

		int acumulador = 0;
		for(int i = 1; i <= num; i++) {
			acumulador += i;
		}
		System.out.println("Soma com for: " + acumulador);

		int valorRetorno = somaRecursiva(num);
		System.out.println("Soma com recursividade: " + valorRetorno);
	}

	private static int somaRecursiva(int num) {
		if(num == 1) {
			return 1;
		} else {
			return num + somaRecursiva(num - 1);
		}

	}
}
