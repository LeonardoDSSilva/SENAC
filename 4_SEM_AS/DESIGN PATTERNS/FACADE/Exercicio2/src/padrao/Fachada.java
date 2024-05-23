package padrao;

import java.util.ArrayList;
import java.util.List;

import modelo.Cliente;
import modelo.Endereco;
import modelo.Produto;

public class Fachada {

	private Cliente cliente;
	private static Fachada instancia;
	
	private Fachada() {
	}

	public static Fachada getInstancia() {
		if (instancia == null) {
			instancia = new Fachada();
		}
		return instancia;
	}


	public void cadastrar() {
		Endereco endereco = new Endereco("Rua 1", 123);
		cliente = new Cliente("Fulano", endereco);
	}

	public void realizarComprar() {
		List<Produto> lista = new ArrayList<>();
		lista.add(new Produto("Arroz", "Alimento", 10.0));
		lista.add(new Produto("Feijão", "Alimento", 8.0));
		lista.add(new Produto("TV", "Eletrônico", 1000.0));
		// cliente.getLista().add(new Produto("Arroz", "Alimento", 10.0));

		cliente.setLista(lista);
	}

	public void exibir() {
		System.out.println(cliente);
	}

}
