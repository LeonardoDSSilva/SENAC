package ex03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int acao;
		exibirLinha();
		System.out.println("1) Ligar o Carro");
		System.out.println("0) Encerrar o programa");
		exibirLinha();
		System.out.print("Digite a ação desejada: ");
		Scanner scanner = new Scanner(System.in);
		acao = scanner.nextInt();

		if (acao == 1) {
			limparTela();
			exibirLinha();
			System.out.println("Bem vindo ao simulador da Autoescola");
			System.out.println("Se Acalma que eu estou Aprendendo");
			exibirLinha();

			Carro carro = new Carro();
			carro.ligar();

			do {
				exibirLinha();
				carro.exibirEstado();
				exibirLinha();
	
				if (carro.marcha < 0) {
					// marcha = -1;
					System.out.println("O Carro está andando de Ré");
					System.out.println("2) Parar o Carro");
					//System.out.println("3) Engatar a marcha");
					acao = exibirInteracao(carro);
	
				} else if (carro.marcha == 0) {
					// marcha = 0
					System.out.println("O Carro está parado");
					exibirLinha();
					System.out.println("1) Desligar o Carro");
					System.out.println("2) Andar");
					System.out.println("3) Engatar a ré");
					acao = exibirInteracao(carro);
				
				} else if (carro.marcha > 0 && carro.marcha < 8) {
					// marcha > 0 && marcha < 8
					System.out.println("O Carro está andando na marcha " + carro.marcha);
					exibirLinha();
					System.out.println("2) Parar o Carro");
					System.out.println("3) Subir marcha");
					System.out.println("4) Descer marcha");
					acao = exibirInteracao(carro);
	
				} else {
					// marcha = 8
					System.out.println("O Carro está andando na marcha " + carro.marcha);
					exibirLinha();
					System.out.println("2) Parar o Carro");
					System.out.println("4) Descer marcha");
					acao = exibirInteracao(carro);			
				}
	
			} while (acao != 1 && carro.estado == true);
		}

		System.out.println("Pode tirar a carteira agora");
		System.out.println("Encerrando o programa...");
	}

	private static int exibirInteracao(Carro carro) {

		int opcao;
		Scanner iScanner = new Scanner(System.in);
		exibirLinha();
		System.out.print("O que deseja fazer? ");
		opcao = iScanner.nextInt();

		switch (opcao) {
			case 1:
				carro.desligar();
				break;
			case 2:
				if (carro.marcha == 0) {
					carro.marcha = 1;
				} else {
					carro.marcha = 0;
				}
				break;
			case 3:
				if (carro.marcha == 0) {
					carro.marcha = -1;
				} else {
					carro.marcha += 1; 
				}
				break;
			case 4:
				carro.marcha -= 1;
				break;

			default:
			break;
		}
		limparTela();
		return opcao;
	}

	private static void exibirLinha() {
		System.out.println("----------------------------------------");
	}

	private static void limparTela() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}