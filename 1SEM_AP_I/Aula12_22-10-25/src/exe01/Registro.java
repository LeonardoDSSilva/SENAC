package exe01;

import java.util.Scanner;

public class Registro {

	Scanner scNum = new Scanner(System.in);
	Scanner scStr = new Scanner(System.in);
	public Cliente cadastrarPaciente(String nome, int idade, String cpf, String endereco, String convenio, String exame) {
		Cliente paciente = new Cliente();

		paciente.nome = nome;
		paciente.idade = idade;
		paciente.cpf = cpf;
		paciente.endereco = endereco;
		paciente.convenio = convenio;
		paciente.exame = exame;

		return paciente;
	}
	// public void cadastrarPaciente(Cliente paciente){
	// 	System.out.println("Informe o nome do paciente: ");
	// 	paciente.nome = scStr.nextLine();
	// 	System.out.println("Informe a idade do paciente: ");
	// 	paciente.idade = scNum.nextInt();
	// 	System.out.println("Informe o CPF do paciente: ");
	// 	paciente.cpf = scStr.nextLine();
	// 	System.out.println("Informe o endereco do paciente: ");
	// 	paciente.endereco = scStr.nextLine();
	// 	System.out.println("Informe o convenio do paciente: ");
	// 	paciente.convenio = scStr.nextLine();
	// 	System.out.println("Informe o exame do paciente: ");
	// 	paciente.exame = scStr.nextLine();
	// }
	public void alterarPaciente(Cliente paciente){
		System.out.println("Qual dado deseja alterar? ");
		System.out.println("1 - Nome");
		System.out.println("2 - Idade");
		System.out.println("3 - CPF");
		System.out.println("4 - Endereco");
		System.out.println("5 - Convenio");
		System.out.println("6 - Exame");
		System.out.println("7 - Sair");
		int opcao = scNum.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("Informe o novo nome do paciente: ");
			paciente.nome = scStr.nextLine();
			break;
		case 2:
			System.out.println("Informe a nova idade do paciente: ");
			paciente.idade = scNum.nextInt();
			break;
		case 3:

		
	}
	public void exbirPaciente(Cliente paciente){
		System.out.println("Nome: " + paciente.nome);
		System.out.println("Idade: " + paciente.idade);
		System.out.println("CPF: " + paciente.cpf);
		System.out.println("Endereco: " + paciente.endereco);
		System.out.println("Convenio: " + paciente.convenio);
		System.out.println("Exame: " + paciente.exame);
	}
	public void excluirPaciente(Cliente paciente){
		System.out.println("Paciente excluido com sucesso!");
	}
}
