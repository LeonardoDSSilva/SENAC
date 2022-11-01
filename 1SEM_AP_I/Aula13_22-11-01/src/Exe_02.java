import java.util.Scanner;

public class Exe_02 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] numeros = new int[20];

		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Digite o %d° número: ", i+1);
			numeros[i] = input.nextInt();
		}

		for (int i = numeros.length-1; i >= 0; i--) {
			System.out.printf(" %d: %d \n", i, numeros[i]);
		}
	}
}
