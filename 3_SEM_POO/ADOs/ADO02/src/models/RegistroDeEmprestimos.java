package models;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import entity.Emprestimo;
import entity.Usuario;



public class RegistroDeEmprestimos extends Emprestimo {
	
	private HashMap<Integer, Emprestimo> emprestimos = new HashMap<Integer, Emprestimo>();
	// private final int MAXIMO_EMPRESTIMOS = 3;
	private final int DIAS_PARA_DEVOLUCAO = 15;


	public RegistroDeEmprestimos() {
		super();
	}

	private Date calcularDataDevolucao() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.DATE, DIAS_PARA_DEVOLUCAO);
		return calendar.getTime();
	}

	public void adicionarEmprestimo(int idLivro, int numeroMatricula) {
		emprestimos.put(idLivro, new Emprestimo(idLivro, numeroMatricula, calcularDataDevolucao()));
	}

	public void removerEmprestimo(int idLivro) {
		emprestimos.remove(idLivro);
	}

	public void listarEmprestimos() {
		for (Emprestimo emprestimo : emprestimos.values()) {
			System.out.println(emprestimo);
		}
	}

	// TODO: implementar metodo para verificar se o usuario ja tem 3 emprestimos
	// TODO: Verificar outras Collections para implementar o metodo listarEmprestimosPorUsuario

}