package interfacesFuncionais;

public class Teste {
	public static void main(String[] args) {
		NomeCompleto nome = new NomeCompleto() {

			@Override
			public String getNome() {
				return "	rd";
			}
		};

		
		nome.exibir(nome.getNome());
		
		// Lambda
		NomeCompleto nome2 = () -> "ld";
		nome2.exibir(nome2.getNome());
	}
}
