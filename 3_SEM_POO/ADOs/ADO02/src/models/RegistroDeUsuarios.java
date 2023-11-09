package models;

import java.util.HashSet;

import entity.Usuario;

public class RegistroDeUsuarios extends Usuario {

	
	public RegistroDeUsuarios() {
		super();
	}

	private HashSet<Usuario> usuarios = new HashSet<Usuario>();


	public void adicionarUsuario(String string, int i) {
		usuarios.add(new Usuario(string, i));
	}

	public void removerUsuarioPorNome(String nome) {
		for (Usuario usuario : usuarios) {
			if (usuario.getNome().equals(nome)) {
				usuarios.remove(usuario);
			}
		}
	}

	public void removerUsuarioPorNumeroMatricula(int numeroMatricula) {
		for (Usuario usuario : usuarios) {
			if (usuario.getNumeroMatricula() == numeroMatricula) {
				usuarios.remove(usuario);
			}
		}
	}

	public void listarUsuarios() {
		for (Usuario usuario : usuarios) {
			System.out.println(usuario);
		}
	}

	
	

}
