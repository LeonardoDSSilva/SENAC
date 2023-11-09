package entity;

public class Usuario {
	private String nome;
	private int numeroMatricula;

	

	public Usuario() {
	}

	public Usuario(String nome, int numeroMatricula) {
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", numeroMatricula=" + numeroMatricula + "]";
	}

}
