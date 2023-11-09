package entity;

import java.util.Date;

public class Emprestimo {
	private int idLivro;
	private int numeroMatricula;
	private Date dataDevolucao;


	public Emprestimo() {
	}

	public Emprestimo(int idLivro, int numeroMatricula, Date dataDevolucao) {
		this.idLivro = idLivro;
		this.numeroMatricula = numeroMatricula;
		this.dataDevolucao = dataDevolucao;
	}

	public int getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(int idLivro) {
		this.idLivro = idLivro;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	@Override
	public String toString() {
		return "Emprestimo [idLivro=" + idLivro + ", numeroMatricula=" + numeroMatricula + ", dataDevolucao="
				+ dataDevolucao + "]";
	}

	

}


