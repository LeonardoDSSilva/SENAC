package ex04;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {

		Scanner iScanner = new Scanner(System.in);
		int quant_AplicadaDia = 0, quant_AplicadaTotal = 0, vacina, opcao;
		int dias = 30; // Periodo de dias para aplicar a vacina
		int dia = 0;

		// 1 - Contra Raiva
		Vacina vacina_ContraRaiva = new Vacina("Contra Raiva", dias);
		// 2 - Contra Vermes tipo 1
		Vacina vacina_ContraVermes1 = new Vacina("Contra Vermes tipo 1", dias);
		// 3 - Contra Vermes tipo 2
		Vacina vacina_ContraVermes2 = new Vacina("Contra Vermes tipo 2", dias);
		// 4 - Contra a Gripe
		Vacina vacina_ContraGripe = new Vacina("Contra a Gripe", dias);
		
		do{
			quant_AplicadaDia = 0;
			do {
				limparTela();

				int quant_Vac01 = vacina_ContraRaiva.exibirQuantidade();
				int quant_Vac02 = vacina_ContraVermes1.exibirQuantidade();
				int quant_Vac03 = vacina_ContraVermes2.exibirQuantidade();
				int quant_Vac04 = vacina_ContraGripe.exibirQuantidade();
				
				exibirMenu(quant_Vac01, quant_Vac02, quant_Vac03, quant_Vac04);
				vacina = iScanner.nextInt();

				switch (vacina) {
					case 1:
						// Contra Raiva
						quant_AplicadaDia += vacina_ContraRaiva.aplicarDose(dia);
					break;
					case 2:
						// Contra Vermes tipo 1
						quant_AplicadaDia += vacina_ContraVermes1.aplicarDose(dia);
					break;
					case 3:
						// Contra Vermes tipo 2
						quant_AplicadaDia += vacina_ContraVermes2.aplicarDose(dia);
					break;
					case 4:
						// Contra a Gripe
						quant_AplicadaDia += vacina_ContraGripe.aplicarDose(dia);
					break;
				}
				System.out.print("Deseja encerrar o dia? (0) Sim (1) Não: ");
				opcao = iScanner.nextInt();
				if (opcao == 0) {
					limparTela();
					exibirLinha();
					vacina_ContraRaiva.mostrarDados(true, dia);
					exibirLinha();
					vacina_ContraVermes1.mostrarDados(true, dia);
					exibirLinha();
					vacina_ContraVermes2.mostrarDados(true, dia);
					exibirLinha();
					vacina_ContraGripe.mostrarDados(true, dia);
					exibirLinha();
					System.out.println("Total de doses aplicadas no dia: " + quant_AplicadaDia);
					exibirLinha();
					System.out.println();
				}
			} while (opcao != 0);
			quant_AplicadaTotal += quant_AplicadaDia;
			dia++;
			System.out.print("Deseja encerrar o programa? (0) Sim (1) Não : ");
			opcao = iScanner.nextInt();
		} while (opcao != 0);

		limparTela();
		exibirLinha();
		vacina_ContraRaiva.mostrarDados(false, 1);
		exibirLinha();
		vacina_ContraVermes1.mostrarDados(false, 1);
		exibirLinha();
		vacina_ContraVermes2.mostrarDados(false, 1);
		exibirLinha();
		vacina_ContraGripe.mostrarDados(false, 1);
		exibirLinha();

		System.out.println("\nTotal de doses aplicadas no programa: " + quant_AplicadaTotal);
		System.out.println();
	}

	public static void exibirMenu(int v01, int v02, int v03, int v04) {

		System.out.println("Qual e a Vacina que deseja aplicar?");
		System.out.println("[1] - Contra Raiva \t\t- " + ((v01) == 0 ? "Nao ha dose disponivel" : ("Doses disponiveis: " + v01)));
		System.out.println("[2] - Contra Vermes tipo 1 \t- " + ((v02) == 0 ? "Nao ha dose disponivel" : ("Doses disponiveis: " + v02)));
		System.out.println("[3] - Contra Vermes tipo 2 \t- " + ((v03) == 0 ? "Nao ha dose disponivel" : ("Doses disponiveis: " + v03)));
		System.out.println("[4] - Contra a Gripe \t\t- " + ((v04) == 0 ? "Nao ha dose disponivel" : ("Doses disponiveis: " + v04)));

		System.out.print("Digite o numero da vacina: ");
	}

	public static void limparTela(){
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
	public static void exibirLinha() {
		System.out.println("------------------------------------------------");
	}
}