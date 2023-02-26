package ex14;

import ex01.Ex01;

public class Ex14 {
	public static void main(String[] args) {
		int[] vetor = Ex01.criarVetor(10);
		contarNumerosPares(vetor);
	}

	private static void contarNumerosPares(int[] vetor) {
		int con = 0;
		for(int ele: vetor){
			if(ele%2 == 0) con ++;
		}
		System.out.printf(((con>=1)?("Tem "+ con + " numeros Pares"):"Não há numeros Par")   );
	}
}
