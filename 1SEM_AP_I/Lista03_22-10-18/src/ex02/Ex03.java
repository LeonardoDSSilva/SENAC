package ex03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int corredor;
		double quantidade, valor, carrinho = 0;
		String encerrar = "", produtoEscholhido, grandeza;

		Mecardoria nota;

		Scanner iScanner = new Scanner(System.in);
		
		do {
			System.out.print("\033[H\033[2J");  
			System.out.flush();

			System.out.println("Qual o corredor que você se encontra? ");
			System.out.println("1 - Corredor A");
			System.out.println("2 - Corredor B");
			System.out.println("3 - Corredor C");
			System.out.print("Informe: ");
			corredor = iScanner.nextInt();

			do {
				System.out.printf("Qual a quantidade que você deseja comprar de %s ? ", produtoEscholhido.toUpperCase());
				quantidade = iScanner.nextDouble();
	
				if (corredor == 1) {
					valor = quantidade * 2.50;
					System.out.println("Valor: R$" + valor);
					grandeza = " Un";
					carrinho += valor;
				}
				else if (corredor == 2) {
					valor = quantidade * 5.00;
					System.out.println("Valor: R$" + valor);
					grandeza = " Un";
					carrinho += valor;
				}
				else {
					valor = quantidade * 20.00;
					System.out.println("Valor: R$" + valor);
					grandeza = " Kg";
					carrinho += valor;
				}
	
				nota = new Mecardoria(produtoEscholhido, quantidade, (valor/quantidade), grandeza);
				NotaFiscal.adicionarNota(nota);
				
				produtoEscholhido = exibirCorredor(corredor);
	
				if (produtoEscholhido != "") {
	
	
					System.out.println("Agora o que voce deseja fazer? (1 - Escolher outro item, 2 - Mudar de corredor, 3 - Encerrar compra)");
					encerrar = iScanner.next().toUpperCase();
				}
			} while (condition);


		} while (!encerrar.equals("N"));

		iScanner.close();

		System.out.print("\033[H\033[2J");  
        System.out.flush();

		NotaFiscal.exibirNota(carrinho);
	}
	
	private static String exibirCorredor(int corredor) {
		int produto;
		Scanner iScanner = new Scanner(System.in);
		
		System.out.print("\033[H\033[2J");  
        System.out.flush();

		switch (corredor) {
			case 1:
				System.out.println("Corredor A - frutas e verduras");
				System.out.println("1 - Melão");
				System.out.println("2 - Pêra");
				System.out.println("3 - Mamão");
				System.out.println("4 - Maçã");
				System.out.println("5 - Uva");
				System.out.println("6 - Abacate");
				System.out.println("7 - Limão");
				System.out.println("8 - Alface");
				System.out.println("9 - Couve");
				System.out.println("10 - Brócolis");
				
				System.out.println("Informe o produto escolhido: ");
				produto = iScanner.nextInt();

				switch (produto) {
					case 1: return "Melão"; 
					case 2: return "Pêra";
					case 3:	return "Mamão";
					case 4: return "Maçã";
					case 5: return "Uva";
					case 6: return "Abacate";
					case 7: return "Limão";
					case 8: return "Alface";
					case 9: return "Couve";
					case 10: return "Brócolis";
				}
			break;

			case 2:
				System.out.println("Corredor B - itens básicos");
				System.out.println("1 - Feijão");
				System.out.println("2 - Arroz");
				System.out.println("3 - Açúcar");
				System.out.println("4 - Biscoito de maisena");
				System.out.println("5 - Farofa");
				System.out.println("6 - Macarrão");
				System.out.println("7 - Óleo");
				System.out.println("8 - Azeite");
				System.out.println("9 - Fubá");
				System.out.println("10 - Pipoca");

				System.out.println("Informe o produto escolhido: ");
				produto = iScanner.nextInt();

				switch (produto) {
					case 1: return "Feijão"; 
					case 2: return "Arroz";
					case 3:	return "Açúcar";
					case 4: return "Biscoito de maisena";
					case 5: return "Farofa";
					case 6: return "Macarrão";
					case 7: return "Óleo";
					case 8: return "Azeite";
					case 9: return "Fubá";
					case 10: return "Pipoca";
				}
			break;

			case 3:
				System.out.println("Corredor C - Orgânicos e saudáveis");
				System.out.println("1 - PTS");
				System.out.println("2 - PTE");
				System.out.println("3 - Lentilha");
				System.out.println("4 - Carne de Jaca");
				System.out.println("5 - Tofu");
				System.out.println("6 - Tofu Defumado");
				System.out.println("7 - Tempeh");
				System.out.println("8 - Seitan");
				System.out.println("9 - Babaganuche");
				System.out.println("10 - Hummus");

				System.out.println("Informe o produto escolhido: ");
				produto = iScanner.nextInt();

				switch (produto) {
					case 1: return "PTS"; 
					case 2: return "PTE";
					case 3:	return "Lentilha";
					case 4: return "Carne de Jaca";
					case 5: return "Tofu";
					case 6: return "Tofu Defumado";
					case 7: return "Tempeh";
					case 8: return "Seitan";
					case 9: return "Babaganuche";
					case 10: return "Hummus";
				}
			break;
			default: System.out.println("Opção inválida!");
		}
		return "";
	}
	// Meio de Pagamento
}
