package exe_05;

public class Exm_05 {
	public static void main(String[] args) {
		Aluno[] alunos = new Aluno[2];

		alunos[0] = new Aluno();
		alunos[0].nome = "João";
		alunos[0].notas[0] = 10;
		alunos[0].notas[1] = 10;
		alunos[0].notas[2] = 10;
		alunos[0].notas[3] = 10;
		alunos[0].media = 10;
		alunos[0].situacao = "Aprovado";
	
		alunos[1] = new Aluno();
		alunos[1].nome = "Maria";
		alunos[1].notas[0] = 5;
		alunos[1].notas[1] = 5;
		alunos[1].notas[2] = 5;
		alunos[1].notas[3] = 5;
		alunos[1].media = 5;
		alunos[1].situacao = "Reprovado";
	
		int indice = 0;
	
		for (Aluno aluno : alunos) {
			System.out.printf(" %d: %s - %.2f - %s \n", indice, aluno.nome, aluno.media, aluno.situacao);
			indice ++;
		}
	}
}
