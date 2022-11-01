package exe_05;

import java.util.Scanner;

public class Exe_05 {

	public static void main(String[] args) {
		Scanner numScanner = new Scanner(System.in);
		Scanner strScanner = new Scanner(System.in);

		Aluno[] alunos = new Aluno[2];
		double media = 0;
		int indice = 0;

		for (int i = 0; i < alunos.length; i++) {
			alunos[i] = new Aluno();
			System.out.printf("Digite o nome do %d° aluno: ", i+1);
			alunos[i].nome = strScanner.nextLine();
			for (int j = 0; j < alunos[i].notas.length; j++) {
				System.out.printf("Digite a %d° nota do aluno %s: ", j+1, alunos[i].nome);
				alunos[i].notas[j] = numScanner.nextDouble();
				media += alunos[i].notas[j];
			}
			alunos[i].media = media / alunos[i].notas.length;
			media = 0;
			if (alunos[i].media < 6) {
				alunos[i].situacao = "Reprovado";
			} else {
				alunos[i].situacao = "Aprovado";
			}
		}

		for (Aluno aluno : alunos) {
			System.out.printf(" %d: %s - %.2f - %s \n", indice, aluno.nome, aluno.media, aluno.situacao);
			indice ++;
		}
		
	}
}
