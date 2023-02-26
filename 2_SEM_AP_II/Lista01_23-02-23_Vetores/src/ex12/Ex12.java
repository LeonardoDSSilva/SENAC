package ex12;

public class Ex12 {
	public static void main(String[] args) {
		int[] a = {1, 0, 5,-2,-5, 7};
		int soma = a[0] + a[1] + a[5];
		System.out.println("Soma dos elementos A[0], A[1] e A[5] do vetor: " + soma);
		System.out.println("Vetor:");
		a[4]=100;
		for(int num: a){
			System.out.println("  " + num);
		}
	}
}
