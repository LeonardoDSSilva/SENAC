import java.util.Random;

public class Exe_01 {

  public static void main(String[] args) {
    int[] vetor = new int[6];
	int num = 0;
	int numrepetido = 0;

    Random random = new Random();
	// int numero = r
    for (int i = 0; i < vetor.length; i++) {
		num = random.nextInt(100);

		for (int j = 0; j < i; j++) {
			if (vetor[j] == num) {
				numrepetido = 1;
			}
		}
		if (numrepetido == 0) {
			vetor[i] = num;
		}
		else {
			i--;
			numrepetido = 0;
		}

    }
	for (int i = 0; i < vetor.length; i++) {
	  System.out.println(vetor[i]);
	}
  }
}