import java.util.Scanner;

public class Exe_03 {
	public static void main(String[] args) {
		int cont = 0;
		int[] numeros = new int[20];

		Scanner input = new Scanner(System.in);


		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Digite o %d° número: ", i+1);
			numeros[i] = input.nextInt();
		}

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				cont++;
			}
		}
		System.out.println("A quantidade de números pares é: " + cont);
		System.out.println("Numeros pares: ");

		for (int num : numeros) {
			if (num % 2 == 0) {
				System.out.println( num);
			} 
		}

	}
}
