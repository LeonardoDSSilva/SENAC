package exe01;

import java.util.Scanner;

public class Clinica {
	public static void main(String[] args) {

		String nome, cpf, endereco, convenio, exame;
		int idade;

		Scanner scNum = new Scanner(System.in);
		Scanner scStr = new Scanner(System.in);

		Registro registro = new Registro();

		System.out.println("Bem vindo a Clinica!");

		System.out.println("1 - Cadastrar Cliente");
		System.out.println("2 - Alterar Cliente");
		System.out.println("3 - Exibir Cliente");


		


		int opcao = scNum.nextInt();

		switch (opcao) {
		case 1:

			Registro nRegistro = new Registro();

			System.out.println("Informe o nome do paciente: ");
			nome = scStr.nextLine();
			System.out.println("Informe a idade do paciente: ");
			idade = scNum.nextInt();
			System.out.println("Informe o CPF do paciente: ");
			cpf = scStr.nextLine();
			System.out.println("Informe o endereco do paciente: ");
			endereco = scStr.nextLine();
			System.out.println("Informe o convenio do paciente: ");
			convenio = scStr.nextLine();
			System.out.println("Informe o exame do paciente: ");
			exame = scStr.nextLine();
			Cliente paciente = nRegistro.cadastrarPaciente(nome, idade, cpf, endereco, convenio, exame);

			System.out.println("Paciente cadastrado com sucesso!");
			break;
		case 2:
			System.out.println("Informe o CPF do paciente: ");
			cpf = scStr.nextLine();
			Cliente paciente2 = nRegistro.cadastrarPaciente(nome, idade, cpf, endereco, convenio, exame);
			nRegistro.alterarPaciente(paciente2);
			break;
		case 3:
			

		Default:
			System.out.println("Opcao invalida!");
			break;
		}


		
	}
}
