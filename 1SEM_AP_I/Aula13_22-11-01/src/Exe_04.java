import java.util.Scanner;

public class Exe_04 {
	public static void main(String[] args) {
		float[] ambientes = new float[4];
		int indice = 1;
		
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < ambientes.length; i++) {
			System.out.println("Informe a largura do ambiente: ");
			ambientes[i] = input.nextFloat();
			System.out.println("Informe o comprimento do ambiente: ");
			ambientes[i] *= input.nextFloat();
		}

		for (float area : ambientes) {
			System.out.printf(" %d: %.2f \n", indice, area);
			indice ++;
		}
	}
}
