package ex10;

import ex01.Ex01;

public class Ex10 {
	public static void main(String[] args) {
		int[] vetor = Ex01.criarVetor(10);
		contarNumerosNegativos(vetor);
	}

	private static void contarNumerosNegativos(int[] vetor) {
		int con = 0;
		for(int ele: vetor){
			if(ele < 0) con ++;
		}
		System.out.printf(((con>=1)?("Tem "+ con + " numeros negativo"):"Não há numeros negativo")   );
	}
}