package ado10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TesteHashSetCPF {
	public static void main(String[] args) {
		Scanner scCpf = new Scanner(System.in);
		Set<String> cpfs = new HashSet<>();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um CPF: ");
			String cpf = scCpf.nextLine();
			cpfs.add(cpf);
			cpfs.add(cpf); // Como testar o que acontece se o usuário digitar o mesmo CPF duas vezes?
		}

		scCpf.close();

		System.out.println("CPF's digitados: ");
		for (String cpf : cpfs) {
			System.out.println(cpf);
		}

		System.out.println("Total de CPF's computados: " + cpfs.size());

	}
}
