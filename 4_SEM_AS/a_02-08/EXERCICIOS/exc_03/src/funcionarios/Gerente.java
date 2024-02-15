package funcionarios;

public class Gerente {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Gerente() {
	}

	public void alteraarSalario(double salario, Funcionario f) {
		f.salario += salario;
	}

	public Gerente(String nome) {
		this.nome = nome;
	}


}
