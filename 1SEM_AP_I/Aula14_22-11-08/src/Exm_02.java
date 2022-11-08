import java.util.Random;

public class Exm_02{
	public static void main(String[] args) {
		Random random = new Random();

		int numero = random.nextInt(10);
		int numero01 = random.nextInt();

		System.out.println(numero);
		System.out.println(numero01);

	}
}