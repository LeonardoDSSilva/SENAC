package ado10;

import java.util.HashMap;
import java.util.Scanner;

public class TesteMapaAluno {
	public static void main(String[] args) {
		Scanner scMat = new Scanner(System.in);
		HashMap<Integer, Aluno> mapaAlunos = new HashMap<>();
		Aluno a1 = new Aluno(123, "João", "ADS");
		Aluno a2 = new Aluno(456, "Maria", "ADS");
		Aluno a3 = new Aluno(789, "José", "ADS");
		Aluno a4 = new Aluno(101, "Ana", "ADS");
		Aluno a5 = new Aluno(112, "Pedro", "ADS");

		mapaAlunos.put(a1.getMatricula(), a1);
		mapaAlunos.put(a2.getMatricula(), a2);
		mapaAlunos.put(a3.getMatricula(), a3);
		mapaAlunos.put(a4.getMatricula(), a4);
		mapaAlunos.put(a5.getMatricula(), a5);

		System.out.println("Digite a matrícula do aluno: ");
		int mat = scMat.nextInt();
		scMat.close();
		
		Aluno r = mapaAlunos.get(mat);
		try {
			System.out.println("Matrícula: " + r.getMatricula());
			System.out.println("Nome: " + r.getNome());
			System.out.println("Curso: " + r.getCurso());
		} catch (NullPointerException e) {
			System.out.println("Aluno não encontrado!");
		}

	}
}
