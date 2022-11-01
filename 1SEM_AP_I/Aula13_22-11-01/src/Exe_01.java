import java.util.Scanner;

public class Exe_01 {
	public static void main(String[] args) {
		int[] nums = new int[10];
		int soma = 0;

		Scanner input = new Scanner(System.in);

		for (int i = 0; i < nums.length; i++) {
			System.out.printf("Digite o %d° número: ", i+1);
			nums[i] = input.nextInt();
			soma += nums[i];
		}

		System.out.printf("A soma dos números é: %d", soma);

	}

}
