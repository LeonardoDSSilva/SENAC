package models;


import java.util.ArrayList;

import entity.Livro;
import enums.Genero;

public class CatalogoDeLivros extends Livro {

	private ArrayList<Livro> livros = new ArrayList<Livro>();

	public CatalogoDeLivros() {
		super();
	}

	public void adicionarLivro(String titulo, String autor, int anoPublicacao, Genero genero) {
		livros.add(new Livro(titulo, autor, anoPublicacao, genero));
	}

	public void removerLivroPorTitulo(String titulo) {
		for (Livro livro : livros) {
			if (livro.getTitulo().equals(titulo)) {
				livros.remove(livro);
			}
		}
	}

	public void removerLivroPorAutor(String autor) {
		for (Livro livro : livros) {
			if (livro.getAutor().equals(autor)) {
				livros.remove(livro);
			}
		}
	}

	public void removerLivroPorAnoPublicacao(int anoPublicacao) {
		for (Livro livro : livros) {
			if (livro.getAnoPublicacao() == anoPublicacao) {
				livros.remove(livro);
			}
		}
	}

	public void removerLivroPorGenero(Genero genero) {
		for (Livro livro : livros) {
			if (livro.getGenero().equals(genero)) {
				livros.remove(livro);
			}
		}
	}

	public void listarLivros() {
		for (Livro livro : livros) {
			System.out.println(livro);
		}
	}
}
	
