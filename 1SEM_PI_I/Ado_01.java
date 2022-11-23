import java.util.Scanner;
import java.util.Random;

public class Ado_01 {

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";

	public static void main(String[] args) {

		System.out.print("\033[H\033[2J");
		System.out.flush();
		Random rand = new Random();
		System.out.println("#### QUIZ ####");
		System.out.println(rand.nextInt(6));
		exibir(rand.nextInt(6));
		System.out.print(ANSI_RESET);
	}

	public static void exibir(int pergunta) {

		Scanner iScanner = new Scanner(System.in);
		int resposta;

		switch (pergunta){
			case 0:
				System.out.println("Qual e a cidade brasileira conhecida como a Terra da Garoa?");
				System.out.println(" [1] - São Paulo");
				System.out.println(" [2] - Rio de Janeiro");
				System.out.println(" [3] - Belo Horizonte");
				System.out.println(" [4] - Brasília");

				System.out.print("Digite a resposta: ");
				resposta = iScanner.nextInt();


				if (resposta != 1) {
					System.out.print(ANSI_RED);
					System.out.println("Resposta incorreta, alternativa correta é [1] - São Paulo");
				}

				switch (resposta) {
					case 1:
						System.out.print(ANSI_GREEN);
						System.out.println("Resposta correta");
						break;
					case 2:
						System.out.println("A cidade do Rio de Janeiro é conhecida como a Cidade Maravilhosa");
						break;
					case 3:
						System.out.println("A cidade de Belo Horizonte é conhecida como a Cidade das Flores");
						break;
					case 4:
						System.out.println("A cidade de Brasília é conhecida como a Cidade do Futuro");
						break;
					default:
						System.out.println("Resposta inválida");
						break;
				}
				break;

			case 1:
				System.out.println("Qual é o distúrbio que afeta a capacidade de escrita e leitura de uma pessoa?");
				System.out.println(" [1] - Miopia");
				System.out.println(" [2] - Astagmatismo");
				System.out.println(" [3] - Dislexia");
				System.out.println(" [4] - Atrófia");

				System.out.print("Digite a resposta: ");
				resposta = iScanner.nextInt();

				if (resposta != 3) {
					System.out.print(ANSI_RED);
					System.out.println("Resposta incorreta, alternativa correta é [3] - Dislexia");
				}

				switch (resposta) {
					case 1:
						System.out.println("Resposta incorreta pois a miopia é um distúrbio visual que afeta a capacidade de enxergar objetos distantes");
						break;
					case 2:
						System.out.println("Resposta incorreta pois o astagmatismo é um distúrbio visual que afeta a capacidade de enxergar objetos próximos");
						break;
					case 3:
						System.out.print(ANSI_GREEN);
						System.out.println("Resposta correta");
						break;
					case 4:
						System.out.println("Resposta incorreta pois a atrofia é um distúrbio muscular que afeta a capacidade de movimentar os músculos");
						break;
					default:
						System.out.println("Resposta inválida");
						break;
				}
				break;

			case 2:
				System.out.println("Qual é o nome do presidente do Brasil que ficou conhecido como Jango?");
				System.out.println(" [1] - Jânio Quadros");
				System.out.println(" [2] - João Goulart");
				System.out.println(" [3] - João Figueiredo");
				System.out.println(" [4] - José Sarney");

				System.out.print("Digite a resposta: ");
				resposta = iScanner.nextInt();

				if (resposta != 2) {
					System.out.print(ANSI_RED);
					System.out.println("Resposta incorreta, alternativa correta é [2] - João Goulart");
				}

				switch (resposta) {
					case 1:
						System.out.println("Resposta incorreta pois Jânio Quadros ficou conhecido como Jango por causa de um apelido que ganhou na infância");
						break;
					case 2:
						System.out.print(ANSI_GREEN);
						System.out.println("Resposta correta");
						break;
					case 3:
						System.out.println("Resposta incorreta pois João Figueiredo ficou conhecido como Figueiredo por causa de um apelido que ganhou na infância");
						break;
					case 4:
						System.out.println("Resposta incorreta pois José Sarney ficou conhecido como Sarney por causa de um apelido que ganhou na infância");
						break;
					default:
						System.out.println("Resposta inválida");
						break;
				}
				break;

			case 3:
				System.out.println("Que tipo de alimento livre de agrotóxicos? ");
				System.out.println(" [1] - Telúrico");
				System.out.println(" [2] - Orgânico");
				System.out.println(" [3] - Transgênico");
				System.out.println(" [4] - Calórico");

				System.out.print("Digite a resposta: ");
				resposta = iScanner.nextInt();

				if (resposta != 2) {
					System.out.print(ANSI_RED);
					System.out.println("Resposta incorreta, alternativa correta é [2] - Orgânico");
				}

				switch (resposta) {
					case 1:
						System.out.println("Resposta incorreta pois o alimento telúrico é um alimento que contém muita ferro");
						break;
					case 2:
						System.out.print(ANSI_GREEN);
						System.out.println("Resposta correta");
						break;
					case 3:
						System.out.println("Resposta incorreta pois o alimento transgênico é onde o alimento é modificado geneticamente");
						break;
					case 4:
						System.out.println("Resposta incorreta pois o alimento calórico é um alimento que contém muita gordura");
						break;
					default:
						System.out.println("Resposta inválida");
						break;
				}
				break;

			case 4:
				System.out.println("Qual a doença que é transmitida pelo mosquito Aedes Aegypti?");
				System.out.println(" [1] - Chikungunya");
				System.out.println(" [2] - Zika");
				System.out.println(" [3] - Febre Amarela");
				System.out.println(" [4] - Dengue");

				System.out.print("Digite a resposta: ");
				resposta = iScanner.nextInt();

				if (resposta != 4) {
					System.out.print(ANSI_RED);
					System.out.println("Resposta incorreta, alternativa correta é [4] - Dengue");
				}

				switch (resposta) {
					case 1:
						System.out.println("Resposta incorreta pois a Chikungunya é uma doença transmitida pelo mosquito Aedes Albopictus");
						break;
					case 2:
						System.out.println("Resposta incorreta pois o Zika é uma doença transmitida pelo mosquito Aedes Albopictus");
						break;
					case 3:
						System.out.println("Resposta incorreta pois a Febre Amarela é uma doença transmitida pelo mosquito Haemagogus");
						break;
					case 4:
						System.out.print(ANSI_GREEN);
						System.out.println("Resposta correta");
						break;
					default:
						System.out.println("Resposta inválida");
						break;
				}
				break;

				case 5:
				System.out.println("Qual é o autor que escreveu o livro 'O Auto da Compadecida'?");
				System.out.println(" [1] - Ariano Suassuna");
				System.out.println(" [2] - Graciliano Ramos");
				System.out.println(" [3] - Machado de Assis");
				System.out.println(" [4] - João Cabral de Melo Neto");

				System.out.print("Digite a resposta: ");
				resposta = iScanner.nextInt();

				if (resposta != 1) {
					System.out.print(ANSI_RED);
					System.out.println("Resposta incorreta, alternativa correta é [1] - Ariano Suassuna");
				}

				switch (resposta) {
					case 1:
						System.out.print(ANSI_GREEN);
						System.out.println("Resposta correta");
						break;
					case 2:
						System.out.println("Graciliano Ramos escreveu o livro 'Vidas Secas'");
						break;
					case 3:
						System.out.println("Machado de Assis escreveu o livro 'Dom Casmurro'");
						break;
					case 4:
						System.out.println("João Cabral de Melo Neto escreveu o livro 'Macunaíma'");
						break;
					default:
						System.out.println("Resposta inválida");
						break;
				}
				break;
			}


	}
	
}
