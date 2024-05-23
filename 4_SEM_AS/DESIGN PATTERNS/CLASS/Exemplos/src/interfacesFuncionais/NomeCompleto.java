package interfacesFuncionais;

@FunctionalInterface
public interface NomeCompleto {
	String getNome();

	default void exibir(String nome) {
		System.out.println(nome);
	}

}
