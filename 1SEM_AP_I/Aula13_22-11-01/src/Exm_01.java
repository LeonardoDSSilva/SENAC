public class Exm_01 {
	public static void main(String[] args) {
		int[] numeros = new int[10];
		int indice = 0;

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] += (i+1);
		}
		for ( int num : numeros) {

			System.out.printf(" %d: %d \n", indice, num);
			indice ++;
		}
	}
}
