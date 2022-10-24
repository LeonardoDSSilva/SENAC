package ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		int categoriaVeiculo, quantVeiculos =0;
		String endDay;
		double caixa = 0;

		Scanner iScanner = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		do {
			exibirTabPrecos();
			System.out.println("Informe a categoria do veículo: ");
			categoriaVeiculo = iScanner.nextInt();

			switch (categoriaVeiculo) {
				case 1:
					caixa += 5;
					quantVeiculos++;
				break;
				case 2:
					caixa += 10;
					quantVeiculos++;
				break;
				case 3:
					caixa += 15;
					quantVeiculos++;
				break;
				case 4:
					caixa += 20;
					quantVeiculos++;
				break;
				case 5:
					quantVeiculos++;
				break;
				default: System.out.println("Opção inválida!");
			}
			
			System.out.println("Deseja encerrar o dia? (S - Sim / N - Não)");
			endDay = sc.nextLine().toUpperCase();
			
		} while (!endDay.equals("S"));
		
		System.out.println("Quantidade de veículos: " + quantVeiculos);
		System.out.println("Valor arrecadado: " + caixa);
		iScanner.close();
		sc.close();
	}

	private static void exibirTabPrecos() {
		System.out.println("1 - Carro Pequeno \t\t (R$ 05,00)");
		System.out.println("2 - Carro Médio \t\t (R$ 10,00)");
		System.out.println("3 - Carro Grande \t\t (R$ 15,00)");
		System.out.println("4 - Van, Ônibus ou Caminhão \t (R$ 20,00)");
		System.out.println("5 - Motocicleta ou Bicicleta \t (Gratuito)");

		System.out.println("");
	}
}
