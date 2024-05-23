package modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nome;
	private Endereco endereco;
	private List<Produto> lista;

	public Cliente() {
		lista = new ArrayList<>();
	}

	public Cliente(String nome, Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
		lista = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Produto> getLista() {
		return lista;
	}

	public void setLista(List<Produto> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", endereco=" + endereco + ", lista=" + lista + "]";
	}

	
}
