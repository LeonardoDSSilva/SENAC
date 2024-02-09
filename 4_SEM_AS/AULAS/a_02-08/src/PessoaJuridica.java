public class PessoaJuridica extends Pessoa{

	private long cnpj;

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	public PessoaJuridica(long cnpj) {
		this.cnpj = cnpj;
	}

	public PessoaJuridica(String nome, long cnpj) {
		super(nome);
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + " CNPJ: " + cnpj;
	}

	

}
