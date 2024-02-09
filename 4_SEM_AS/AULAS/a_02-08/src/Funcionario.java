public class Funcionario extends PessoaFisica {
	private int matricula;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Funcionario(long cpf, int matricula) {
		super(cpf);
		this.matricula = matricula;
	}

	public Funcionario(String nome, long cpf, int matricula) {
		super(nome, cpf);
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + " CPF: " + getCpf() + " Matricula: " + matricula;
	}

	
}
